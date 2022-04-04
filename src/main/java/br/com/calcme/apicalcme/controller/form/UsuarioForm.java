package br.com.calcme.apicalcme.controller.form;

import br.com.calcme.apicalcme.modelo.Usuario;
import br.com.calcme.apicalcme.repository.UsuarioRepository;

public class UsuarioForm {
	private String nome;
	private String email;
	private String telefone;
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
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Usuario converter() {
		// TODO Auto-generated method stub
		return new Usuario(nome, email, telefone);
	}
	
	public Usuario atualizar(String id, UsuarioRepository usuarioRepository) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuario.setNome(this.nome);
		usuario.setEmail(this.email);
		usuario.setTelefone(this.telefone);
		
		return usuario;
	}

}
