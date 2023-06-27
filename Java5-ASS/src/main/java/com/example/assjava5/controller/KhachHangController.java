package com.example.assjava5.controller;

import com.example.assjava5.model.KhachHang;
import com.example.assjava5.model.NXS;
import com.example.assjava5.service.KhachHangService;
import com.example.assjava5.service.NXSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<KhachHang> list = khSV.getAll();
        model.addAttribute("kh", list);
        String view = "khach-hang/index";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten,
                       @RequestParam("ten_dem") String tenDem,
                       @RequestParam("ho") String ho,
                       @RequestParam("ngay_sinh") Date ngaySinh,
                       @RequestParam("sdt") String sdt,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("thanh_pho") String thanhPho,
                       @RequestParam("quoc_gia") String quocGia,
                       @RequestParam("mat_khau") String matKhau) {
        KhachHang kh = new KhachHang();
        kh.setMa(ma);
        kh.setTen(ten);
        kh.setTenDem(tenDem);
        kh.setHo(ho);
        kh.setNgaySinh(ngaySinh);
        kh.setSdt(sdt);
        kh.setDiaChi(diaChi);
        kh.setThanhPho(thanhPho);
        kh.setQuocGia(quocGia);
        kh.setMatKhau(matKhau);
        khSV.save(kh);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        khSV.xoa(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        KhachHang kh = khSV.findById(id).orElse(null);
        model.addAttribute("kh", kh);
        String view = "khach-hang/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                       @PathVariable("id") UUID id,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten,
                       @RequestParam("ten_dem") String tenDem,
                       @RequestParam("ho") String ho,
                       @RequestParam("ngay_sinh") Date ngaySinh,
                       @RequestParam("sdt") String sdt,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("thanh_pho") String thanhPho,
                       @RequestParam("quoc_gia") String quocGia,
                       @RequestParam("mat_khau") String matKhau) {
        KhachHang kh = new KhachHang();
        kh.setId(id);
        kh.setMa(ma);
        kh.setTen(ten);
        kh.setTenDem(tenDem);
        kh.setHo(ho);
        kh.setNgaySinh(ngaySinh);
        kh.setSdt(sdt);
        kh.setDiaChi(diaChi);
        kh.setThanhPho(thanhPho);
        kh.setQuocGia(quocGia);
        kh.setMatKhau(matKhau);
        khSV.save(kh);
        return "redirect:/khach-hang/hien-thi";
    }
}
