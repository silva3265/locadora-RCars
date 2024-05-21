package com.locadora.locacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.locacao.domain.Carro;
import com.locadora.locacao.exceptions.ObjectNotFoundException;
import com.locadora.locacao.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public Carro findById(Integer id) {
		Optional<Carro> obj = carroRepository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Objeto Não encontrado! Tipo: " + id + ", Tipo: " + Carro.class.getName()));
	}

	public List<Carro> findAll() {
		return carroRepository.findAll();
	}

	public Carro update(Integer id, Carro obj) {

		Carro newObj = findById(id);
		newObj.setAnoFabricacao(obj.getAnoFabricacao());
		newObj.setCor(obj.getCor());
		newObj.setDescricao(obj.getDescricao());
		newObj.setFabricante(obj.getFabricante());
		newObj.setModelo(obj.getModelo());
		
		return carroRepository.save(newObj);
		
	}

	public Carro create(Carro obj) {
		obj.setId(null);
		return carroRepository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		carroRepository.deleteById(id);;
		
		
	}
	

}
