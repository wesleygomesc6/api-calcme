package br.com.calcme.apicalcme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.calcme.apicalcme.modelo.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository <Usuario, String> {
	List<Usuario> findByNome(String nome);

	Optional<Usuario> findById(String id);

}
