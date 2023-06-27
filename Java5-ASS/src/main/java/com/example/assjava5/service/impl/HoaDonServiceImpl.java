package com.example.assjava5.service.impl;

import com.example.assjava5.model.HoaDon;
import com.example.assjava5.repository.HoaDonRepository;
import com.example.assjava5.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HoaDonServiceImpl implements HoaDonService {
@Autowired
    HoaDonRepository hdRepo;
    @Override
    public List<HoaDon> getAll() {
        return (List<HoaDon>) hdRepo.findAll();
    }

    @Override
    public void Save(HoaDon hd) {
        hdRepo.save(hd);
    }

    @Override
    public Optional<HoaDon> findById(UUID id) {
        return hdRepo.findById(id);
    }

    @Override
    public void Xoa(UUID id) {
       hdRepo.deleteById(id);
    }
}
