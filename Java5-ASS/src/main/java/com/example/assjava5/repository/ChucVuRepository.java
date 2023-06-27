package com.example.assjava5.repository;

import com.example.assjava5.model.ChucVu;
import com.example.assjava5.model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
//    ArrayList<ChucVu> findbyId(UUID id);
}
