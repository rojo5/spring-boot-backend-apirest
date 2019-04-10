package com.udemy.cursospring.models.service;

import java.util.List;

import com.udemy.cursospring.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
