package com.example.assjava5.service.impl;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.repository.ChucVuRepository;
import com.example.assjava5.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    ChucVuRepository cvRepo;

    @Override
    public List<ChucVu> getAll() {
        return (List<ChucVu>) cvRepo.findAll();
    }

    @Override
    public Optional<ChucVu> findById(UUID id) {
        return cvRepo.findById(id);
    }

    @Override
    public void save(ChucVu cv) {
        cvRepo.save(cv);
    }

    @Override
    public void xoa(UUID id) {
        cvRepo.deleteById(id);
    }

}
