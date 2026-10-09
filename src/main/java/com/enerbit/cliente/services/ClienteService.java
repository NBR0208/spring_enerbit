
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 */

package com.enerbit.cliente.services;

import com.enerbit.cliente.model.cliente;
import java.util.List;

/**
 *
 * @author dange
 */
public interface ClienteService {

    List<cliente> listarClientes();

    cliente guardarCliente(cliente cliente);

    cliente obtenerClientePorId(Long id);

    cliente actualizarCliente(cliente cliente);

    void eliminarCliente(Long id);
}