package model.repository;

import model.entity.Cliente;
import java.util.HashMap;

public class ClienteRepository {

    private HashMap<Integer, Cliente> clientes = new HashMap<>();

    public void salvar(Cliente cliente){
        clientes.put(cliente.getId(), cliente);
    }

    public Cliente buscarPorId(int id){
        return clientes.get(id);
    }

    public Cliente buscarPorTelefone(String telefone){
        for (Cliente c : clientes.values()){
            if(c.getTelefone().equals(telefone)) return c;
        }
        return null;
    }

    public HashMap<Integer, Cliente> listarTodos(){
        return clientes;
    }

    public boolean remover(int id){
        return clientes.remove(id) != null;
    }
}
