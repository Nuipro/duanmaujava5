package com.example.assjava5.controller;

import com.example.assjava5.model.DongSP;
import com.example.assjava5.model.NXS;
import com.example.assjava5.model.NhanVien;
import com.example.assjava5.service.NXSService;
import com.example.assjava5.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/nxs")
public class NXSController {
    @Autowired
    private NXSService nxsSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<NXS> list = nxsSV.getAll();
        model.addAttribute("nxs", list);
        String view = "NXS/index";
        model.addAttribute("view",view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten) {
        NXS nxs = new NXS();
        nxs.setMa(ma);
        nxs.setTen(ten);
        nxsSV.them(nxs);
        return "redirect:/nxs/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        nxsSV.xoa(id);
        return "redirect:/nxs/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        NXS nxs = nxsSV.findById(id).orElse(null);
        model.addAttribute("nxs", nxs);
        String view = "NXS/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten
    ) {
        NXS nxs = new NXS();
        nxs.setId(id);
        nxs.setMa(ma);
        nxs.setTen(ten);
        nxsSV.them(nxs);
        return "redirect:/nxs/hien-thi";
    }
}
