package com.example.assjava5.service.impl;

import com.example.assjava5.model.KhachHang;
import com.example.assjava5.repository.KhachHangRepository;
import com.example.assjava5.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khRepo;

    @Override
    public ArrayList<KhachHang> getAll() {
        return (ArrayList<KhachHang>) khRepo.findAll();
    }

    @Override
    public Optional<KhachHang> findById(UUID id) {
        return khRepo.findById(id);
    }

    @Override
    public void save(KhachHang kh) {
        khRepo.save(kh);
    }

    @Override
    public void xoa(UUID id) {
        khRepo.deleteById(id);
    }

    @Override
    public Optional<KhachHang> findByMa(String ma) {
        return khRepo.findByMa(ma);
    }
}
