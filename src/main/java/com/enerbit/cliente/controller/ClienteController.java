
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

package com.enerbit.cliente.controller;

import com.enerbit.cliente.model.cliente;
import com.enerbit.cliente.services.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Listar todos los clientes
    @GetMapping
    public List<cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    // Buscar cliente por ID
    @GetMapping("/{id}")
    public cliente obtenerCliente(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id);
    }

    // Guardar un cliente
    @PostMapping
    public cliente guardarCliente(@RequestBody cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    // Actualizar un cliente
    @PutMapping("/{id}")
    public cliente actualizarCliente(
            @PathVariable Long id,
            @RequestBody cliente cliente) {

        cliente.setIdCliente(id);

        return clienteService.actualizarCliente(cliente);
    }

    // Eliminar un cliente
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }
}
