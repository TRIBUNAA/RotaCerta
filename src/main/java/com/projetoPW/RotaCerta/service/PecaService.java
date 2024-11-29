package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Peca;
import com.projetoPW.RotaCerta.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaService {

    @Autowired
    private PecaRepository repository;

    public List<Peca> listar() {
        return repository.findAll();
    }

    public Peca buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Peca cadastrar(Peca peca) {
        return repository.save(peca);
    }

    public Peca alterar(Peca peca) {
        return repository.save(peca);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
