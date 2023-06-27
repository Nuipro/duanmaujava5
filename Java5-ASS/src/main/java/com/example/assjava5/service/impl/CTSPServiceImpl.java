package com.example.assjava5.service.impl;

import com.example.assjava5.model.ChiTietSP;
import com.example.assjava5.repository.CTSPSRepository;
import com.example.assjava5.service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CTSPServiceImpl implements CTSPService {
   @Autowired
    CTSPSRepository ctspRepo;

    @Override
    public List<ChiTietSP> getAll() {
        return (List<ChiTietSP>) ctspRepo.findAll();
    }

    @Override
    public void them(ChiTietSP sp) {
        ctspRepo.save(sp);
    }

    @Override
    public void xoa(UUID id) {
        ctspRepo.deleteById(id);
    }

    @Override
    public ChiTietSP getById(UUID id) {
        return ctspRepo.getById(id);
    }

    @Override
    public void sua(ChiTietSP sp) {
        ctspRepo.save(sp);
    }

    @Override
    public Optional<ChiTietSP> findById(UUID id) {
        return ctspRepo.findById(id);
    }
}
