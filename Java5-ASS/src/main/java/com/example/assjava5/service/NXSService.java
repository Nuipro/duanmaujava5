package com.example.assjava5.service;

import com.example.assjava5.model.NXS;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface NXSService {
    public ArrayList<NXS> getAll();
    public void them(NXS nxs);
    public NXS getById(UUID id);
    Optional<NXS> findById(UUID id);
    void xoa(UUID id);
}
