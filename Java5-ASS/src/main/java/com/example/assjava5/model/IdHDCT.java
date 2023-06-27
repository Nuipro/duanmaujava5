package com.example.assjava5.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class IdHDCT implements Serializable {

    private HoaDon hd;


    private ChiTietSP ctsp;

}
