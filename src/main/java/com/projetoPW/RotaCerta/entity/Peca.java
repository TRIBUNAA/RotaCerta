package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_PECA")
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PECA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_VEICULO", nullable = false)
    private Veiculo veiculo;

    @Column(name = "TX_NOME", nullable = false)
    private String nome;

    @Column(name = "VL_PECA", nullable = false, columnDefinition = "decimal")
    private Double valor;

    @Column(name = "TX_TEMPO_MEDIO_SUBSTITUICAO", nullable = false)
    private Integer tempoMedioSubstituicao;

    public void setId(Long id) {
        this.id = id;
    }
}
