package com.example.assjava5.service.impl;

import com.example.assjava5.model.MauSac;
import com.example.assjava5.repository.MauSacRepository;
import com.example.assjava5.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    MauSacRepository msRepo;

    @Override
    public ArrayList<MauSac> getAll() {
        return (ArrayList<MauSac>) msRepo.findAll();
    }

    @Override
    public MauSac getById(UUID id) {
        return msRepo.getById(id);
    }

    @Override
    public Optional<MauSac> findById(UUID id) {
        return msRepo.findById(id);
    }

    @Override
    public void xoa(UUID id) {
        msRepo.deleteById(id);
    }

    @Override
    public void save(MauSac ms) {
        msRepo.save(ms);
    }

//    @Override
//    public ArrayList<MauSac> finbyId(UUID id) {
//        return (ArrayList<MauSac>) msRepo.findbyId(id);
//    }
}
