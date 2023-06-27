package com.example.assjava5.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity(name = "CuaHang")
@Table(name = "cua_hang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CuaHang {
    @Id
//    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;


    @Column(name = "thanh_pho")
    private String thanhPho;

    @Column(name = "quoc_gia")
    private String quocGia;


    @Column(name = "dia_chi")
    private String diaChi;



}
