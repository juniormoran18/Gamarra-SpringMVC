package com.guillen.gamarrapp.dao;

import java.util.List;

import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Tienda;

public interface TiendaDAO {
	
	Tienda findTienda(int id) throws DAOException, EmptyResultException;

	void create(String nombre, int telefono, String latitud, String altitud, String direccion, int idComerciante) throws DAOException;

	void delete(int id) throws DAOException;

	void update(String nombre, int telefono, String latitud, String altitud, String direccion, int idComerciante) throws DAOException;

	List<Tienda> findAllTiendas() throws DAOException, EmptyResultException;

	List<Tienda> findTiendasByName(String nombre) throws DAOException, EmptyResultException;

	List<Tienda> findTiendasByCategoria(String categoria) throws DAOException, EmptyResultException;
	
	//aun editando

}