package com.example.assjava5.service;

import com.example.assjava5.model.CuaHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CuaHangService {
    public List<CuaHang> getAll();
    Optional<CuaHang> findById(UUID id);
    void save(CuaHang ch);
    void xoa(UUID id);
}
