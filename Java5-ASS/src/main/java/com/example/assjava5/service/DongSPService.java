package com.example.assjava5.service;

import com.example.assjava5.model.DongSP;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface DongSPService {
    public ArrayList<DongSP> getAll();

    public DongSP getById(UUID id);
    void save(DongSP dsp);
    void xoa(UUID id);
    Optional<DongSP> findById(UUID id);

}
