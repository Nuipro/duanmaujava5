package com.example.assjava5.service;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.model.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChucVuService {
    public List<ChucVu> getAll();
//    public ArrayList<ChucVu> findbyId(UUID id);
    Optional<ChucVu> findById(UUID id);
    void save(ChucVu cv);
    void xoa(UUID id);
}
