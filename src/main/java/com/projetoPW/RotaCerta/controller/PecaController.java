package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.Peca;
import com.projetoPW.RotaCerta.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pecas")
public class PecaController {

    @Autowired
    private PecaService service;

    // Listar todas as peças
    @GetMapping
    public List<Peca> listar() {
        return service.listar();
    }

    // Buscar peça por ID
    @GetMapping("/{id}")
    public Peca buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Cadastrar uma nova peça
    @PostMapping
    public Peca cadastrar(@RequestBody Peca peca) {
        return service.cadastrar(peca);
    }

    // Alterar dados de uma peça
    @PutMapping("/{id}")
    public Peca alterar(@RequestBody Peca peca, @PathVariable Long id) {
        peca.setId(id);
        return service.alterar(peca);
    }

    // Excluir peça por ID
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}