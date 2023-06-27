package com.example.assjava5.service;

import com.example.assjava5.model.MauSac;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface MauSacService {
    public ArrayList<MauSac> getAll();

    public MauSac getById(UUID id);

    Optional<MauSac> findById(UUID id);

    void xoa(UUID id);
    void save(MauSac ms);
}
