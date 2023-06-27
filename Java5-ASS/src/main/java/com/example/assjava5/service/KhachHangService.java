package com.example.assjava5.service;

import com.example.assjava5.model.KhachHang;
import com.example.assjava5.model.NhanVien;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface KhachHangService {
    public ArrayList<KhachHang> getAll();
    public Optional<KhachHang> findById(UUID id);
    void save(KhachHang kh);
    void xoa(UUID id);
    Optional<KhachHang> findByMa(String ma);
}
