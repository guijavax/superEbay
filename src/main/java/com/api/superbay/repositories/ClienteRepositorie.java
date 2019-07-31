package com.api.superbay.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.superbay.entities.ClientEntitie;

@Repository
public interface ClienteRepositorie extends JpaRepository<ClientEntitie, Long> {
	
	@Query(value = "SELECT * FROM client "
			+ "WHERE cpf= :cpf",
			nativeQuery = true)
	ClientEntitie findClientByCpf(@Param("cpf") Long cpf);
	
	@Query(value="SELECT * from client "
			+ "where client_name like :name% ", nativeQuery = true)
	List<ClientEntitie> findByName(@Param("name") String name);
}
