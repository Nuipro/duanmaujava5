package com.example.assjava5.repository;

import com.example.assjava5.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, UUID> {
    ArrayList<NhanVien> findByTen(String name);

    Optional<NhanVien> findByMa(String ma);

}
