package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.Veiculo;
import com.projetoPW.RotaCerta.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    // Listar todos os veículos
    @GetMapping
    public List<Veiculo> listar() {
        return service.listar();
    }

    // Buscar veículo por ID
    @GetMapping("/{id}")
    public Veiculo buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Cadastrar um novo veículo
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return service.cadastrar(veiculo);
    }

    // Alterar dados de um veículo
    @PutMapping("/{id}")
    public Veiculo alterar(@RequestBody Veiculo veiculo, @PathVariable Long id) {
        veiculo.setId(id);
        return service.alterar(veiculo);
    }

    // Excluir veículo por ID
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}