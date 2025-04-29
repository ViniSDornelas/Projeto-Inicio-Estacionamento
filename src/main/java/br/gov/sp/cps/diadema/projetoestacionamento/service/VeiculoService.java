package br.gov.sp.cps.diadema.projetoestacionamento.service;

import br.gov.sp.cps.diadema.projetoestacionamento.model.Veiculo;
import br.gov.sp.cps.diadema.projetoestacionamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
