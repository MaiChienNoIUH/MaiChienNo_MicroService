package vn.edu.iuh.fit.productservice.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma", nullable = false)
    private Long ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private double gia;

    @Column(name = "mo_ta", nullable = false)
    private String moTa;

    @Column(name = "ton_kho")
    private int tonKho;
}
