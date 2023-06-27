package com.example.assjava5.repository;

import com.example.assjava5.model.DongSP;
import com.example.assjava5.model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
@Repository
public interface DongSPRepository extends JpaRepository<DongSP, UUID> {
//    ArrayList<DongSP> findbyId(UUID id);
}
