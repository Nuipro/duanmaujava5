package com.example.assjava5.service.impl;

import com.example.assjava5.model.HDCT;
import com.example.assjava5.model.HoaDon;
import com.example.assjava5.repository.HDCTRepository;
import com.example.assjava5.service.HDCTService;
import com.example.assjava5.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HDCTServiceImpl implements HDCTService {
    @Autowired
    HDCTRepository hdctRepo;
    @Autowired
    HoaDonService hdSV;

    @Override
    public List<HDCT> getAll() {
        return (List<HDCT>) hdctRepo.findAll();
    }

    @Override
    public void Save(HDCT hdct) {
        hdctRepo.save(hdct);
    }

    @Override
    public void xoa(HDCT hdct) {
        hdctRepo.delete(hdct);
    }


    @Override
    public void deleteByHoaDonId(UUID id) {
        hdctRepo.deleteByHoaDonId(id);
    }

    @Override
    public void deleteHDCTByHoaDonId(UUID id) {
        HoaDon hd = new HoaDon();
        hd.setId(id);
        List<HDCT> hdcts = hdctRepo.findByHd(hd);

        for (HDCT hdct : hdcts) {
            hdctRepo.delete(hdct);
        }
    }

    @Override
    public List<HDCT> findByIdHd(HoaDon hd) {
        return hdctRepo.findByHd(hd);
    }


}
