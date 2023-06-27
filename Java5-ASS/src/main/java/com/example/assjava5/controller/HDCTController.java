package com.example.assjava5.controller;

import com.example.assjava5.model.ChiTietSP;
import com.example.assjava5.model.HDCT;
import com.example.assjava5.model.HoaDon;
import com.example.assjava5.service.CTSPService;
import com.example.assjava5.service.HDCTService;
import com.example.assjava5.service.HoaDonService;
import com.example.assjava5.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hdct")
public class HDCTController {
    @Autowired
    private HDCTService hdctSV;
    @Autowired
    private HoaDonService hdSV;
    @Autowired
    private CTSPService ctspSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<HDCT> list = hdctSV.getAll();
        List<ChiTietSP> ctsp = ctspSV.getAll();
        List<HoaDon> hd = hdSV.getAll();
        model.addAttribute("hdct", list);
        model.addAttribute("hd", list);
        model.addAttribute("ctsp", list);

        return "hdct/index";
    }





}
