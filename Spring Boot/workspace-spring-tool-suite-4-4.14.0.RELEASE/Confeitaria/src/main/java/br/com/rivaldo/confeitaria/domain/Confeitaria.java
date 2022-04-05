package br.com.rivaldo.confeitaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Confeitaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Short sysId;
	@Column(length = 50, nullable = false)
	public String nome;
	@Column(length = 50, nullable = false)
	public String endereco;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;
}
