package com.example.assjava5.controller;

import com.example.assjava5.model.MauSac;
import com.example.assjava5.model.NXS;
import com.example.assjava5.service.MauSacService;
import com.example.assjava5.service.NXSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {
    @Autowired
    private MauSacService msSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<MauSac> list = msSV.getAll();
        model.addAttribute("ms", list);
        String view = "mau-sac/index";
        model.addAttribute("view",view);
        return "layout";
    }
    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten) {
        MauSac ms = new MauSac();
        ms.setMa(ma);
        ms.setTen(ten);
        msSV.save(ms);
        return "redirect:/mau-sac/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        msSV.xoa(id);
        return "redirect:/mau-sac/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        MauSac ms = msSV.findById(id).orElse(null);
        model.addAttribute("ms",ms );
        String view = "mau-sac/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten
    ) {
        MauSac ms = new MauSac();
        ms.setId(id);
        ms.setMa(ma);
        ms.setTen(ten);
        msSV.save(ms);
        return "redirect:/mau-sac/hien-thi";
    }

}
