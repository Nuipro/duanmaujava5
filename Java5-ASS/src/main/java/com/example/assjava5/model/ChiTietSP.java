package com.example.assjava5.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "ChiTietSP")
@Table(name = "chi_tiet_sp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChiTietSP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_sp")
    private SanPham sp;

    @ManyToOne
    @JoinColumn(name = "id_nsx")
    private NXS nxs;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac")
    private MauSac ms;

    @ManyToOne
    @JoinColumn(name = "id_dong_sp")
    private DongSP dsp;

    @Column(name = "nam_bh")
    private int namBH;

    @Column(name = "mo_ta")
        private String moTa;

    @Column(name = "so_luong_ton")
    private int soLuongTon;

    @Column(name = "gia_nhap")
    private double giaNhap;

    @Column(name = "gia_ban")
    private double giaBan;


}
