package com.example.assjava5.repository;

import com.example.assjava5.model.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
}
