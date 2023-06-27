package com.example.assjava5.service;

import com.example.assjava5.model.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NhanVienService {
    public List<NhanVien> getAll();
    public Optional<NhanVien> findById(UUID id);
    void save(NhanVien nv);
    void xoa(UUID id);
    Optional<NhanVien> findByMa(String ma);
}
