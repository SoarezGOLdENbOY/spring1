package com.senai.Daniel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Daniel.entities.Cliente;
import com.senai.Daniel.repositories.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService (ClienteRepository clienteRepository ) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente getClienteById(Long idcCliente) {
        return clienteRepository.findById(idcCliente).orElse(null);
    }

    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    public void deleteCliente(Long idcCliente) {
        clienteRepository.deleteById(idcCliente);
    }

}
