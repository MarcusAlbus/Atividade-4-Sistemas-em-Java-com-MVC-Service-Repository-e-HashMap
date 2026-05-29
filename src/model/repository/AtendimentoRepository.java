package model.repository;

import model.entity.Atendimento;

import javax.swing.*;
import java.util.HashMap;

public class AtendimentoRepository {

    private HashMap<Integer, Atendimento> atendimentos = new HashMap<>();

    public void salvar(Atendimento atendimento){
        atendimentos.put(atendimento.getId(), atendimento);
    }

    public Atendimento buscarPorId(int id){
        return atendimentos.get(id);
    }

    public HashMap<Integer, Atendimento> listarTodos(){
        return atendimentos;
    }

    public boolean remover(int id){
        return atendimentos.remove(id) != null;
    }

}
