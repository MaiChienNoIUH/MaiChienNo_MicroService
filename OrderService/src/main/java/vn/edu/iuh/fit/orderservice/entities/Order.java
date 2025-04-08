package vn.edu.iuh.fit.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma", nullable = false)
    private Long ma;

    @Column(name = "ngay_dat")
    private Timestamp ngayDat;

    @Column(name = "thanh_tien")
    private double thanhTien;

    @Column(name = "mo_ta")
    private String moTa;

}
