package com.locadora.locacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locadora.locacao.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
