package com.example.assignment_java5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hdct")
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon hoaDon;
    @ManyToOne
    @JoinColumn(name = "id_ctsp")
    private HoaDonChiTiet hoaDonChiTiet;

    private Integer so_luong_mua;
    private Double gia_ban;
    private Double tong_tien;
    private String trang_thai;
    private Date ngay_tao;
    private Date ngay_sua;
}
