package com.example.assjava5.service.impl;

import com.example.assjava5.model.NXS;
import com.example.assjava5.model.NhanVien;
import com.example.assjava5.repository.NXSRepository;
import com.example.assjava5.service.NXSService;
import com.example.assjava5.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class NXSServiceImpl implements NXSService {
    @Autowired
    NXSRepository nxsRepo;

    @Override
    public ArrayList<NXS> getAll() {
        return (ArrayList<NXS>) nxsRepo.findAll();
    }

    @Override
    public void them(NXS nxs) {
        nxsRepo.save(nxs);
    }

    @Override
    public NXS getById(UUID id) {
        return nxsRepo.getById(id);
    }

    @Override
    public Optional<NXS> findById(UUID id) {
        return nxsRepo.findById(id);
    }

    @Override
    public void xoa(UUID id) {
        nxsRepo.deleteById(id);
    }
}
