package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Veiculo;
import com.projetoPW.RotaCerta.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listar() {
        return repository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Veiculo cadastrar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public Veiculo alterar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}