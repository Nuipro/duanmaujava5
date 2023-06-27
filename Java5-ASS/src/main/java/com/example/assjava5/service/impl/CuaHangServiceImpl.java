package com.example.assjava5.service.impl;

import com.example.assjava5.model.CuaHang;
import com.example.assjava5.repository.CuaHangRepository;
import com.example.assjava5.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangService {
    @Autowired
    CuaHangRepository chRepo;

    @Override
    public List<CuaHang> getAll() {
        return (List<CuaHang>) chRepo.findAll();
    }

    @Override
    public Optional<CuaHang> findById(UUID id) {
        return chRepo.findById(id);
    }

    @Override
    public void save(CuaHang ch) {
        chRepo.save(ch);
    }

    @Override
    public void xoa(UUID id) {
        chRepo.deleteById(id);
    }
}
