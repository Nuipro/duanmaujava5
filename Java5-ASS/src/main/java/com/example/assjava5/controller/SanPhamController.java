package com.example.assjava5.controller;

import com.example.assjava5.model.DongSP;
import com.example.assjava5.model.NXS;
import com.example.assjava5.model.SanPham;
import com.example.assjava5.service.NXSService;
import com.example.assjava5.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamService spSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<SanPham> list = spSV.getAll();
        model.addAttribute("sp", list);
        String view = "san-pham/index";
        model.addAttribute("view",view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten
    ) {
        SanPham sp = new SanPham();
        sp.setMa(ma);
        sp.setTen(ten);
        spSV.save(sp);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        spSV.xoa(id);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
       SanPham sp = spSV.findById(id).orElse(null);
        model.addAttribute("sp", sp);
        String view = "san-pham/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten
    ) {
        SanPham sp = new SanPham();
        sp.setId(id)    ;
        sp.setMa(ma);
        sp.setTen(ten);
        spSV.save(sp);
        return "redirect:/san-pham/hien-thi";
    }
}
