package com.example.assjava5.controller;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.model.CuaHang;
import com.example.assjava5.model.KhachHang;
import com.example.assjava5.model.NhanVien;
import com.example.assjava5.service.ChucVuService;
import com.example.assjava5.service.CuaHangService;
import com.example.assjava5.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienService nvSV;
    @Autowired
    private ChucVuService cvSV;
    @Autowired
    private CuaHangService chSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<NhanVien> list = nvSV.getAll();
        List<ChucVu> cv = cvSV.getAll();
        List<CuaHang> ch = chSV.getAll();
        model.addAttribute("cv", cv);
        model.addAttribute("ch", ch);
        model.addAttribute("listNhanVien", list);
        System.out.println(list.get(0).getCh().getTen());
        String view = "nhan-vien/nhan-vien";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("id_cv") UUID idCv,
                       @RequestParam("id_ch") UUID idCh,
                       @RequestParam("ten") String ten,
                       @RequestParam("ten_dem") String tenDem,
                       @RequestParam("ho") String ho,
                       @RequestParam("ngay_sinh") Date ngaySinh,
                       @RequestParam("sdt") String sdt,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("gioi_tinh") String gioiTinh,
                       @RequestParam("trang_thai") Integer trangThai,
                       @RequestParam("mat_khau") String matKhau) {
        NhanVien nv = new NhanVien();
        ChucVu cv = cvSV.findById(idCv).orElse(null);
        CuaHang ch = chSV.findById(idCh).orElse(null);
        nv.setCh(ch);
        nv.setCv(cv);
        nv.setMa(ma);
        nv.setTen(ten);
        nv.setTenDem(tenDem);
        nv.setHo(ho);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ngaySinh);
        nv.setSdt(sdt);
        nv.setTrangThai(trangThai);
        nv.setDiaChi(diaChi);
        nv.setMatKhau(matKhau);
        nvSV.save(nv);
        return "redirect:/nhan-vien/hien-thi";
    }


    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        nvSV.xoa(id);
        return "redirect:/nhan-vien/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        NhanVien nv = nvSV.findById(id).orElse(null);
        List<ChucVu> cv = cvSV.getAll();
        List<CuaHang> ch = chSV.getAll();
        model.addAttribute("cv", cv);
        model.addAttribute("ch", ch);
        model.addAttribute("nv", nv);
        String view = "nhan-vien/detail";
        model.addAttribute("view", view);
        return "layout";
    }
    @PostMapping("/update/{id}")
    public String update(Model model,
                       @PathVariable("id") UUID id,
                       @RequestParam("ma") String ma,
                       @RequestParam("id_cv") UUID idCv,
                       @RequestParam("id_ch") UUID idCh,
                       @RequestParam("ten") String ten,
                       @RequestParam("ten_dem") String tenDem,
                       @RequestParam("ho") String ho,
                       @RequestParam("ngay_sinh") Date ngaySinh,
                       @RequestParam("sdt") String sdt,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("gioi_tinh") String gioiTinh,
                       @RequestParam("trang_thai") Integer trangThai,
                       @RequestParam("mat_khau") String matKhau) {
        NhanVien nv = new NhanVien();
        ChucVu cv = cvSV.findById(idCv).orElse(null);
        CuaHang ch = chSV.findById(idCh).orElse(null);
        nv.setId(id);
        nv.setCh(ch);
        nv.setCv(cv);
        nv.setMa(ma);
        nv.setTen(ten);
        nv.setTenDem(tenDem);
        nv.setHo(ho);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ngaySinh);
        nv.setSdt(sdt);
        nv.setTrangThai(trangThai);
        nv.setDiaChi(diaChi);
        nv.setMatKhau(matKhau);
        nvSV.save(nv);
        return "redirect:/nhan-vien/hien-thi";
    }
}
