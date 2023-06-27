package com.example.assjava5.service;

import com.example.assjava5.model.ChiTietSP;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CTSPService {
    public List<ChiTietSP> getAll();
    public void them(ChiTietSP sp);
    public void xoa(UUID id);
    public ChiTietSP getById(UUID id);
    public void sua(ChiTietSP sp);
    public Optional<ChiTietSP> findById(UUID id);
}
