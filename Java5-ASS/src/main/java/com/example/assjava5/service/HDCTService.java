package com.example.assjava5.service;

import com.example.assjava5.model.HDCT;
import com.example.assjava5.model.HoaDon;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HDCTService {
    public List<HDCT> getAll();

    public void Save(HDCT hdct);

    public void xoa(HDCT hdct);

    public void deleteByHoaDonId(UUID id);

    public void deleteHDCTByHoaDonId(UUID id);


    List<HDCT> findByIdHd(HoaDon hd);
}
