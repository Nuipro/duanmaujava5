package com.example.assjava5.repository;

import com.example.assjava5.model.HDCT;
import com.example.assjava5.model.HoaDon;
import com.example.assjava5.model.IdHDCT;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface HDCTRepository extends JpaRepository<HDCT, IdHDCT> {
    @Transactional
    @Modifying
    @Query("DELETE FROM HDCT h WHERE h.hd.id =:id")
    void deleteByHoaDonId(@Param("id") UUID id);

    List<HDCT> findByHd(HoaDon hd);

}
