package br.com.projetoweb.programacaoprojetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoweb.programacaoprojetoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
