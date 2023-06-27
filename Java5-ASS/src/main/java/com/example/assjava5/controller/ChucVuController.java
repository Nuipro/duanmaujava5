package com.example.assjava5.controller;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.model.CuaHang;
import com.example.assjava5.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chuc-vu")
public class ChucVuController {

    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<ChucVu> list = chucVuService.getAll();
        model.addAttribute("cv", list);
        String view = "chuc-vu/index";
        model.addAttribute("view",view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten
    ) {
        ChucVu cv = new ChucVu();
        cv.setMa(ma);
        cv.setTen(ten);
        chucVuService.save(cv);
        return "redirect:/chuc-vu/hien-thi";
    }
    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        chucVuService.xoa(id);
        return "redirect:/chuc-vu/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        ChucVu cv = chucVuService.findById(id).orElse(null);
        model.addAttribute("cv", cv);
        String view = "chuc-vu/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                       @PathVariable("id") UUID id,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten
    ) {
        ChucVu cv = new ChucVu();
        cv.setId(id);
        cv.setMa(ma);
        cv.setTen(ten);
        chucVuService.save(cv);
        return "redirect:/chuc-vu/hien-thi";
    }
}
