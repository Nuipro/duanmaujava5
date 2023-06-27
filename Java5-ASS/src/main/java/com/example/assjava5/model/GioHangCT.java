package com.example.assjava5.model;

import jakarta.persistence.*;

import lombok.Data;

@Table(name = "gio_hang_chi_tiet")
@Entity
@Data
@IdClass(IdGioHangChiTiet.class)
public class GioHangCT {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_gio_hang", referencedColumnName = "id")
    private GioHang gh;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_sp", referencedColumnName = "id")
    private ChiTietSP ctsp;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private double donGia;

}
