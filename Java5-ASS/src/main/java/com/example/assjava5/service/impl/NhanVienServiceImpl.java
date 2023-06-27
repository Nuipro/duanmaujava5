package com.example.assjava5.service.impl;

import com.example.assjava5.model.NhanVien;
import com.example.assjava5.repository.NhanVienRepository;
import com.example.assjava5.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienRepository nvRepo;

    @Override
    public List<NhanVien> getAll() {
        return (List<NhanVien>) nvRepo.findAll();
    }

    @Override
    public Optional<NhanVien> findById(UUID id) {
        return nvRepo.findById(id);
    }

    @Override
    public void save(NhanVien nv) {
        nvRepo.save(nv);
    }

    @Override
    public void xoa(UUID id) {
        nvRepo.deleteById(id);
    }

    @Override
    public Optional<NhanVien> findByMa(String ma) {
        return nvRepo.findByMa(ma);
    }
}
