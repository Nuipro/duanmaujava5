package com.example.assjava5.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "hoa_don_chi_tiet")
@Entity
@Data
@IdClass(IdHDCT.class)
public class HDCT {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_hoa_don", referencedColumnName = "id")
    private HoaDon hd;


    @Id
    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_sp", referencedColumnName = "id")
    private ChiTietSP ctsp;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private double donGia;
}
