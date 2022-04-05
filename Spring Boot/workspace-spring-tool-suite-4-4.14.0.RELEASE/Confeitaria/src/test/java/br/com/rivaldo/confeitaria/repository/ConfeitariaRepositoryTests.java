package br.com.rivaldo.confeitaria.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.rivaldo.confeitaria.domain.Confeitaria;
import br.com.rivaldo.confeitaria.ropository.ConfeitariaRepository;

@SpringBootTest
public class ConfeitariaRepositoryTests {
	@Autowired
	private ConfeitariaRepository confeitariaRep;
	
	@Test
	public void inserir() {
		Confeitaria conf1 = new Confeitaria(null, "Confeitaria da Rosa", "Área rural, povoado Bonfim", null);

		Confeitaria conf2 = new Confeitaria(null, "Confeitaria do José", "Centro, avenida Bonfim", null);
		
		confeitariaRep.save(conf1);
		confeitariaRep.save(conf2);
	}
}
