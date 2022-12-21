package br.com.alurafood.pagamentos.repository;

import br.com.alurafood.pagamentos.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamentos, Long> {
}
