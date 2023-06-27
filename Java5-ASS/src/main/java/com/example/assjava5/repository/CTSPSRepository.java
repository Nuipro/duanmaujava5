package com.example.assjava5.repository;

import com.example.assjava5.model.ChiTietSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CTSPSRepository extends JpaRepository<ChiTietSP, UUID> {
}
