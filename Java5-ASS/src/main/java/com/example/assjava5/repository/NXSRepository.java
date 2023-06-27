package com.example.assjava5.repository;

import com.example.assjava5.model.MauSac;
import com.example.assjava5.model.NXS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
@Repository
public interface NXSRepository extends JpaRepository<NXS, UUID> {
//    ArrayList<NXS> findbyId(UUID id);
}
