package com.example.assjava5.repository;

import com.example.assjava5.model.MauSac;
import com.example.assjava5.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, UUID> {
    @Override
    Optional<SanPham> findById(UUID id);
}
