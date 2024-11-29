package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TBL_OBJETIVO")
public class Objetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OBJETIVO")
    private Long id;

    @Column(name = "TX_DESCRICAO_OBJETIVO", nullable = false)
    private String descricao;

    @Column(name = "VL_ATUAL_META", nullable = false, columnDefinition = "decimal")
    private Double valorAtual;

    @Column(name = "VL_FINAL_META", nullable = false,columnDefinition = "decimal" )
    private Double valorFinal;

    @Column(name = "DT_FINAL_META", nullable = false)
    private LocalDate dataFinal;

    public void setId(Long id) {
        this.id = id;
    }
}

