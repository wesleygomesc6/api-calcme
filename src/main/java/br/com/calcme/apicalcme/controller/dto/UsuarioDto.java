package br.com.calcme.apicalcme.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.calcme.apicalcme.modelo.Usuario;

public class UsuarioDto {
	private String id; 
    private String nome;
    private String email;
    private String telefone;
    
    public UsuarioDto(Usuario usuario) {
    	this.id = usuario.getId();
    	this.nome = usuario.getNome();
    	this.email = usuario.getEmail();
    	this.telefone = usuario.getTelefone();
    	   		
    }

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

    
	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
