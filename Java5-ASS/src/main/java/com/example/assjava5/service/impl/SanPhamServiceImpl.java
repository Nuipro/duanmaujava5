package com.example.assjava5.service.impl;

import com.example.assjava5.model.SanPham;
import com.example.assjava5.repository.SanPhamRepository;
import com.example.assjava5.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository spRepo;

    @Override
    public ArrayList<SanPham> getAll() {
        return (ArrayList<SanPham>) spRepo.findAll();
    }

    @Override
    public SanPham getById(UUID id) {
        return spRepo.getById(id);
    }

    @Override
    public Optional<SanPham> findById(UUID id) {
        return spRepo.findById(id);
    }

    @Override
    public void save(SanPham sp) {
        spRepo.save(sp);
    }

    @Override
    public void xoa(UUID id) {
        spRepo.deleteById(id);
    }

}
