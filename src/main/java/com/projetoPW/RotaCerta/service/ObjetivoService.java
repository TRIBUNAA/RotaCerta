package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Objetivo;
import com.projetoPW.RotaCerta.repository.ObjetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetivoService {

    @Autowired
    private ObjetivoRepository repository;

    public List<Objetivo> listar() {
        return repository.findAll();
    }

    public Objetivo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Objetivo cadastrar(Objetivo objetivo) {
        return repository.save(objetivo);
    }

    public Objetivo alterar(Objetivo objetivo) {
        return repository.save(objetivo);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}