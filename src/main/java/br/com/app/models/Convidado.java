package br.com.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name= "convidado")
public class Convidado {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String email;
	private String Telefone;
	
	

	public Convidado(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		Telefone = telefone;
	}

	public Convidado() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	

}
