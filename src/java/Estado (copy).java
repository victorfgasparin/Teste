package br.com.fsi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
}
