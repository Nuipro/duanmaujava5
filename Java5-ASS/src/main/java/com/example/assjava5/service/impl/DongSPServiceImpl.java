package com.example.assjava5.service.impl;

import com.example.assjava5.model.DongSP;
import com.example.assjava5.repository.DongSPRepository;
import com.example.assjava5.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class DongSPServiceImpl implements DongSPService {
    @Autowired
    DongSPRepository dspRepo;

    @Override
    public ArrayList<DongSP> getAll() {
        return (ArrayList<DongSP>) dspRepo.findAll();
    }

    @Override
    public DongSP getById(UUID id) {
        return dspRepo.getById(id);
    }

    @Override
    public void save(DongSP dsp) {
        dspRepo.save(dsp);
    }

    @Override
    public void xoa(UUID id) {
        dspRepo.deleteById(id);
    }

    @Override
    public Optional<DongSP> findById(UUID id) {
        return dspRepo.findById(id);
    }

//    @Override
//    public ArrayList<DongSP> findbyId(UUID id) {
//        return (ArrayList<DongSP>) dspRepo.findbyId(id);
//    }
}
