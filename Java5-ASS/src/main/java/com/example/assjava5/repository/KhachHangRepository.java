package com.example.assjava5.repository;

import com.example.assjava5.model.KhachHang;
import com.example.assjava5.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, UUID> {
    Optional<KhachHang> findByMa(String ma);
}
