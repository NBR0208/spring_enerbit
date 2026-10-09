package com.enerbit.cliente.services; 
import com.enerbit.cliente.model.cliente; 
import com.enerbit.cliente.repository.ClienteRepository; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

@Service 
public class ClienteServiceImple implements ClienteService {
    @Autowired 
    private ClienteRepository clienteRepository;
    
    @Override 
    public List<cliente> listarClientes() { 
        return clienteRepository.findAll(); 
    }
    
    @Override 
    public cliente guardarCliente(cliente cliente) { 
        return clienteRepository.save(cliente); 
    }
    
    @Override 
    public cliente obtenerClientePorId(Long id) { 
        return clienteRepository.findById(id).orElse(null); 
    }
    
    @Override 
    public cliente actualizarCliente(cliente cliente) { 
        return clienteRepository.save(cliente); 
    }
    
    @Override 
    public void eliminarCliente(Long id) { 
        clienteRepository.deleteById(id);
    } 
}

