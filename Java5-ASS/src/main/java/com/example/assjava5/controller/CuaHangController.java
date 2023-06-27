package com.example.assjava5.controller;

import com.example.assjava5.model.CuaHang;
import com.example.assjava5.model.KhachHang;
import com.example.assjava5.service.CuaHangService;
import com.example.assjava5.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {
    @Autowired
    private CuaHangService chSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<CuaHang> list = chSV.getAll();
        model.addAttribute("ch", list);
        String view = "cua-hang/index";
        model.addAttribute("view",view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("thanh_pho") String thanhPho,
                       @RequestParam("quoc_gia") String quocGia
    ) {
        CuaHang ch = new CuaHang();
        ch.setMa(ma);
        ch.setTen(ten);
        ch.setDiaChi(diaChi);
        ch.setThanhPho(thanhPho);
        ch.setQuocGia(quocGia);
        chSV.save(ch);
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        chSV.xoa(id);
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        CuaHang ch = chSV.findById(id).orElse(null);
        model.addAttribute("ch", ch);
        String view = "cua-hang/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                       @PathVariable("id") UUID id,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten,
                       @RequestParam("dia_chi") String diaChi,
                       @RequestParam("thanh_pho") String thanhPho,
                       @RequestParam("quoc_gia") String quocGia
    ) {
        CuaHang ch = new CuaHang();
        ch.setId(id);
        ch.setMa(ma);
        ch.setTen(ten);
        ch.setDiaChi(diaChi);
        ch.setThanhPho(thanhPho);
        ch.setQuocGia(quocGia);
        chSV.save(ch);
        return "redirect:/cua-hang/hien-thi";
    }
}
