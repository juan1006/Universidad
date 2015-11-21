package com.mycompany.desarrollovca.service;

import java.util.List;

public interface ServiceInterface<T> {
	public List<T> listarTodos();
    public Integer insertar(T object);
    public List<T> listarPor(String[] filtro);
    public List<T> listarPor(String filtro);
    public void elimnar(T object);
    public void actualizar(T object);
    public T buscar(Integer pk);
}
