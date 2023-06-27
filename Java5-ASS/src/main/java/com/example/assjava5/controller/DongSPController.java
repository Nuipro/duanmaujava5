package com.example.assjava5.controller;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.model.DongSP;
import com.example.assjava5.model.NXS;
import com.example.assjava5.service.DongSPService;
import com.example.assjava5.service.NXSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/dsp")
public class DongSPController {
    @Autowired
    private DongSPService dspSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<DongSP> list = dspSV.getAll();
        model.addAttribute("dsp", list);
        String view = "DSP/index";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten
    ) {
        DongSP dsp = new DongSP();
        dsp.setMa(ma);
        dsp.setTen(ten);
        dspSV.save(dsp);
        return "redirect:/dsp/hien-thi";
    }

    @GetMapping("xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        dspSV.xoa(id);
        return "redirect:/dsp/hien-thi";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model, @PathVariable("id") UUID id) {
        DongSP dsp = dspSV.findById(id).orElse(null);
        model.addAttribute("dsp", dsp);
        String view = "DSP/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten
    ) {
        DongSP dsp = new DongSP();
        dsp.setId(id);
        dsp.setMa(ma);
        dsp.setTen(ten);
        dspSV.save(dsp);
        return "redirect:/dsp/hien-thi";
    }
}
