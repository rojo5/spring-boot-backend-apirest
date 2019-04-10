package com.udemy.cursospring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.udemy.cursospring.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
