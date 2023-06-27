package com.example.assjava5.controller;

import com.example.assjava5.model.*;
import com.example.assjava5.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonService hdSV;
    @Autowired
    private KhachHangService khSV;
    @Autowired
    private NhanVienService nvSV;
    @Autowired
    private HDCTService hdctSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<HoaDon> list = hdSV.getAll();
        List<NhanVien> nv = nvSV.getAll();
        List<KhachHang> kh = khSV.getAll();
        model.addAttribute("kh", kh);
        model.addAttribute("nv", nv);
        model.addAttribute("hd", list);
        String view = "hoa-don/index";
        model.addAttribute("view", view);
        return "layout";
    }

    @GetMapping("/xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        hdctSV.deleteHDCTByHoaDonId(id);
        hdSV.Xoa(id);
        return "redirect:/hoa-don/hien-thi";

    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        HoaDon hd = hdSV.findById(id).orElse(null);
        List<HDCT> hdlist = hdctSV.findByIdHd(hd);
        String tt = "";

        if (hd.getTinhTrang() == 0) {
            tt = "Chưa thanh toán";
        } else {
            tt = "Đã thanh toán";
        }
        if (hd.getKh().getMa() == null) {
            model.addAttribute("test", "");
        }
        double totalPrice = getTotalPrice(hdlist);
        model.addAttribute("tt", tt);
        model.addAttribute("totalPrice", totalPrice);
        model.addAttribute("hdlist", hdlist);
        model.addAttribute("hd", hd);
        String view = "hoa-don/detail";
        model.addAttribute("view", view);
        return "layout";

    }

    private double getTotalPrice(List<HDCT> listhdct) {
        double totalPrice = 0.0;
        for (HDCT hdct : listhdct) {
            totalPrice += hdct.getDonGia() * hdct.getSoLuong();
        }
        return totalPrice;
    }
}
