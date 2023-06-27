package com.example.assjava5.controller;

import com.example.assjava5.model.*;
import com.example.assjava5.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ctsp")
public class ChiTietSPController {
    @Autowired
    private CTSPService ctspSV;
    @Autowired
    private MauSacService msSV;
    @Autowired
    private DongSPService dspSV;
    @Autowired
    private NXSService nxsSV;
    @Autowired
    private SanPhamService spSV;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        List<ChiTietSP> list = ctspSV.getAll();
        List<MauSac> ms = msSV.getAll();
        List<DongSP> dsp = dspSV.getAll();
        List<NXS> nxs = nxsSV.getAll();
        List<SanPham> sp = spSV.getAll();
        model.addAttribute("ms", ms);
        model.addAttribute("dsp", dsp);
        model.addAttribute("nxs", nxs);
        model.addAttribute("sp", sp);
        model.addAttribute("ctsp", list);
        String view = "CTSP/index";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("id_sp") UUID id_sp,
                       @RequestParam("id_nxs") UUID id_nxs,
                       @RequestParam("id_mau_sac") UUID id_mau_sac,
                       @RequestParam("id_dong_sp") UUID id_dong_sp,
                       @RequestParam("nam_bh") Integer nam_bh,
                       @RequestParam("mo_ta") String mo_ta,
                       @RequestParam("so_luong_ton") String so_luong_ton,
                       @RequestParam("gia_nhap") Double gia_nhap,
                       @RequestParam("gia_ban") Double gia_ban) {
        ChiTietSP ctsp = new ChiTietSP();
        SanPham sp = spSV.getById(id_sp);
        DongSP dsp = dspSV.getById(id_dong_sp);
        MauSac ms = msSV.getById(id_mau_sac);
        NXS nxs = nxsSV.getById(id_nxs);
        ctsp.setSp(sp);
        ctsp.setDsp(dsp);
        ctsp.setMs(ms);
        ctsp.setNxs(nxs);
        ctsp.setNamBH(nam_bh);
        ctsp.setMoTa(mo_ta);
        ctsp.setSoLuongTon(Integer.parseInt(so_luong_ton));
        ctsp.setGiaNhap(gia_nhap);
        ctsp.setGiaBan(gia_ban);
        ctspSV.them(ctsp);
        System.out.println(id_sp);
        return "redirect:/ctsp/hien-thi";

    }

    @GetMapping("/xoa/{id}")
    public String xoa(@PathVariable("id") UUID id) {
        System.out.println(id);
        ctspSV.xoa(id);
        return "redirect:/ctsp/hien-thi";

    }

    @GetMapping("/detail/{id}")
    public String detail(Model model,
                         @PathVariable("id") UUID id) {
        ChiTietSP ctsp = ctspSV.getById(id);

        List<MauSac> ms = msSV.getAll();
        List<DongSP> dsp = dspSV.getAll();
        List<NXS> nxs = nxsSV.getAll();
        List<SanPham> sp = spSV.getAll();
        model.addAttribute("ms", ms);
        model.addAttribute("dsp", dsp);
        model.addAttribute("nxs", nxs);
        model.addAttribute("sp", sp);
        model.addAttribute("ctsp", ctsp);
        System.out.println(id);
        String view = "CTSP/detail";
        model.addAttribute("view", view);
        return "layout";
    }

    @PostMapping("/update/{id}")
    public String update(
            @PathVariable("id") UUID id,
            @RequestParam("id_sp") UUID id_sp,
            @RequestParam("id_nxs") UUID id_nxs,
            @RequestParam("id_mau_sac") UUID id_mau_sac,
            @RequestParam("id_dong_sp") UUID id_dong_sp,
            @RequestParam("nam_bh") Integer nam_bh,
            @RequestParam("mo_ta") String mo_ta,
            @RequestParam("so_luong_ton") String so_luong_ton,
            @RequestParam("gia_nhap") Double gia_nhap,
            @RequestParam("gia_ban") Double gia_ban) {
        ChiTietSP ctsp = new ChiTietSP();
        SanPham sp = spSV.getById(id_sp);
        DongSP dsp = dspSV.getById(id_dong_sp);
        MauSac ms = msSV.getById(id_mau_sac);
        NXS nxs = nxsSV.getById(id_nxs);
        ctsp.setId(id);
        ctsp.setSp(sp);
        ctsp.setDsp(dsp);
        ctsp.setMs(ms);
        ctsp.setNxs(nxs);
        ctsp.setNamBH(nam_bh);
        ctsp.setMoTa(mo_ta);
        ctsp.setSoLuongTon(Integer.parseInt(so_luong_ton));
        ctsp.setGiaNhap(gia_nhap);
        ctsp.setGiaBan(gia_ban);
        ctspSV.sua(ctsp);


        return "redirect:/ctsp/hien-thi";

    }
}
