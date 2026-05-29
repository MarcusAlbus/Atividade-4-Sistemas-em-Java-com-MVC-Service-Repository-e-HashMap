package model.service;

import model.entity.Cliente;
import model.repository.ClienteRepository;

import java.util.HashMap;
import java.util.List;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void salvar(Cliente cliente){
        clienteRepository.salvar(cliente);
    }

    public Cliente buscarPorId(int id){
        Cliente cliente = clienteRepository.buscarPorId(id);
        if(cliente == null){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else{
            return cliente;
        }
    }

    public HashMap<Integer,Cliente> listaTodos(){
        HashMap<Integer ,Cliente> list = clienteRepository.listarTodos();
        if (list.isEmpty()){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else{
            return list;
        }
    }


}
