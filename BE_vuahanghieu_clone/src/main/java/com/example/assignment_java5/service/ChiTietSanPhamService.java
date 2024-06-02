package com.example.assignment_java5.service;

import com.example.assignment_java5.model.ChiTietSanPham;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> listCTSP();
    Page<ChiTietSanPham> findPaginated(int pageNo, int pageSize);
}
