package com.example.assjava5.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class IdGioHangChiTiet implements Serializable {
    private GioHang gh;

    private ChiTietSP ctsp;
}
