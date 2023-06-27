package com.example.assjava5.service;

import com.example.assjava5.model.HoaDon;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HoaDonService {
    public List<HoaDon> getAll();
    public void Save(HoaDon hd);
    public Optional<HoaDon> findById(UUID id);
    public void Xoa(UUID id);
}
