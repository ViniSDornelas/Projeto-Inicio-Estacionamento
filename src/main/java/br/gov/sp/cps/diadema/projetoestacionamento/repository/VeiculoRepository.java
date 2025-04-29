package br.gov.sp.cps.diadema.projetoestacionamento.repository;

import br.gov.sp.cps.diadema.projetoestacionamento.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
