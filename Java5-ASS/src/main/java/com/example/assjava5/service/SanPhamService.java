package com.example.assjava5.service;

import com.example.assjava5.model.SanPham;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface SanPhamService {
    public ArrayList<SanPham> getAll();

    public SanPham getById(UUID id);

    Optional<SanPham> findById(UUID id);

    void save(SanPham sp);
    void xoa(UUID id);
}
