package com.example.assjava5.controller;

import com.example.assjava5.model.*;
import com.example.assjava5.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ban-hang")
public class BanHangController {

    @Autowired
    private SanPhamService spSV;
    @Autowired
    private CTSPService ctspSV;
    @Autowired
    private KhachHangService khSV;
    @Autowired
    private NhanVienService nvSV;
    @Autowired
    private HoaDonService hdSV;
    @Autowired
    private HDCTService hdctSV;
    LocalDate current = LocalDate.now();

    @GetMapping("/home")
    public String home(Model model) {
        List<SanPham> sp = spSV.getAll();
        List<ChiTietSP> list = ctspSV.getAll();
        List<KhachHang> kh = khSV.getAll();
        List<NhanVien> nv = nvSV.getAll();
        model.addAttribute("nv", nv);
        model.addAttribute("kh", kh);
        model.addAttribute("ctsp", list);
        model.addAttribute("sp", sp);
        String view = "ban-hang/tao_hoa_don";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/buy")
    public String buy(Model model,
                      @RequestParam("id_nv") UUID id_NV,
                      @RequestParam("id_kh") UUID id_KH,
                      @RequestParam("ma") String ma,
                      @RequestParam("ngay_tao") Date ngay_tao

    ) {
        HoaDon hd = new HoaDon();
        KhachHang kh = khSV.findById(id_KH).orElse(null);
        NhanVien nv = nvSV.findById(id_NV).orElse(null);
        hd.setKh(kh);
        hd.setNv(nv);
        hd.setMa(ma);
        hd.setSdt(kh.getSdt());
        hd.setTenNguoiNhan(kh.getTen());
        hd.setNgayTao(ngay_tao);
        hd.setDiaChi(kh.getDiaChi());
        hdSV.Save(hd);
        System.out.println(hd.toString());
        return "redirect:/ban-hang/hoa-don/" + hd.getId();
    }

    @GetMapping("/hoa-don/{id}")
    public String hoadon(@PathVariable UUID id, Model model) {
        String tt = "";
        HoaDon hd = hdSV.findById(id).orElse(null);
        List<ChiTietSP> ctsp = ctspSV.getAll();
        if (hd.getTinhTrang() == 0) {
            tt = "Chưa thanh toán";
        } else {
            tt = "Đã thanh toán";
        }
        if (hd.getKh().getMa() == null) {
            model.addAttribute("test", "");
        }

        model.addAttribute("ctsp", ctsp);
        model.addAttribute("hdForm", hd);
        model.addAttribute("tt", tt);
        String view = "ban-hang/hoa_don";
        model.addAttribute("view", view);
        return "layout";
    }

    @GetMapping("/xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        System.out.println(id);
        hdSV.Xoa(id);
        return "redirect:/hoa-don/hien-thi";
    }

    @PostMapping("/thanhtoan")
    public String them(Model model,
                       @RequestParam("id_hoa_don") UUID idHd,
                       @RequestParam("id_chi_tiet_sp") List<UUID> idCTSP,
                       @RequestParam("so_luong") List<Integer> soLuong
    ) {
        HDCT hdct = new HDCT();

        HoaDon hd = hdSV.findById(idHd).orElse(null);
        for (int i = 0; i < idCTSP.size(); i++) {
            ChiTietSP ctsp = ctspSV.findById(idCTSP.get(i)).orElse(null);
            hdct.setCtsp(ctsp);
            hdct.setSoLuong(soLuong.get(i));
            hdct.setHd(hd);
            hd.setTinhTrang(1);
            hdct.setDonGia(soLuong.get(i) * ctsp.getGiaBan());
            hdSV.Save(hd);
            hdctSV.Save(hdct);
            ctsp.setSoLuongTon(ctsp.getSoLuongTon() - soLuong.get(i));
            ctspSV.sua(ctsp);
            System.out.println(hdct.toString());
            System.out.println(soLuong);
            System.out.println(idCTSP);
            System.out.println(idHd);
        }
        return "redirect:/hoa-don/hien-thi";
    }
}
