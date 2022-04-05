package br.com.rivaldo.confeitaria.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rivaldo.confeitaria.domain.Confeitaria;

public interface ConfeitariaRepository extends JpaRepository<Confeitaria, Short> {

}
