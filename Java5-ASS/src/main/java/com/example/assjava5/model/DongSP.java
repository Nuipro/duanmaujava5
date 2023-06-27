package com.example.assjava5.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "DongSP")
@Table(name = "dong_sp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DongSP {
    @Id
//    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

}
