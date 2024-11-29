package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_VEICULO")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VEICULO")
    private Long id;

    @Column(name = "TX_TIPO_VEICULO", nullable = false)
    private String tipo;

    @Column(name = "TX_MODELO", nullable = false)
    private String modelo;

    @Column(name = "TX_MARCA", nullable = false)
    private String marca;

    @Column(name = "KM_RODADOS", nullable = false)
    private Double kmRodados;

    @Column(name = "TX_ANO_FABRICACAO", nullable = false)
    private Integer anoFabricacao;

    public void setId(Long id) {
        this.id = id;
    }

}
