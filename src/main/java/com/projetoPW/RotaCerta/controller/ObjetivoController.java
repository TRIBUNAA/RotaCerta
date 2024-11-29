package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.Objetivo;
import com.projetoPW.RotaCerta.service.ObjetivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objetivos")
public class ObjetivoController {

    @Autowired
    private ObjetivoService service;

    // Listar todos os objetivos
    @GetMapping
    public List<Objetivo> listar() {
        return service.listar();
    }

    // Buscar objetivo por ID
    @GetMapping("/{id}")
    public Objetivo buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Cadastrar um novo objetivo
    @PostMapping
    public Objetivo cadastrar(@RequestBody Objetivo objetivo) {
        return service.cadastrar(objetivo);
    }

    // Alterar dados de um objetivo
    @PutMapping("/{id}")
    public Objetivo alterar(@RequestBody Objetivo objetivo, @PathVariable Long id) {
        objetivo.setId(id);
        return service.alterar(objetivo);
    }

    // Excluir objetivo por ID
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
