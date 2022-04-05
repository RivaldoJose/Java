package br.com.rivaldo.confeitaria.ropository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rivaldo.confeitaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {
	
}
