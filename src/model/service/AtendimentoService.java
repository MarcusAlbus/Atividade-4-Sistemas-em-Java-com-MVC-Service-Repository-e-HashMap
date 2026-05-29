package model.service;

import model.entity.Atendimento;
import model.entity.StatusAtendimento;
import model.repository.AtendimentoRepository;

import java.util.HashMap;

public class AtendimentoService {

    private AtendimentoRepository atendimentoRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository){
        this.atendimentoRepository = atendimentoRepository;
    }
    public void salvar(Atendimento atendimento){
        atendimentoRepository.salvar(atendimento);
    }

    public Atendimento buscarPorId(int id){
        Atendimento atendimento = atendimentoRepository.buscarPorId(id);
        if(atendimento == null){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else{
            return atendimento;
        }
    }

    public HashMap<Integer,Atendimento> listarTodos(){
        HashMap<Integer, Atendimento> list = atendimentoRepository.listarTodos();
        if(list.isEmpty()){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else{
            return list;
        }
    }
    public void remover(int id){
        Atendimento atendimento = atendimentoRepository.buscarPorId(id);
        if(atendimento == null){
            throw new RuntimeException("ERRO: atendimento não encontrado");
        }else{
            atendimentoRepository.remover(id);
        }
    }

    public void atualizarStatus(int id, StatusAtendimento novoStatus){
        Atendimento atendimento = atendimentoRepository.buscarPorId(id);
        if(atendimento == null){
            throw new RuntimeException("ERRO: atendimento não encontrado");
        }else{
            if(atendimento.getStatus() == StatusAtendimento.Finalizado && novoStatus == StatusAtendimento.Cancelado){
                throw new RuntimeException("ERRO: não é possível cancelar um atendimento já finalizado");
            }
            if(atendimento.getStatus() == StatusAtendimento.Cancelado && novoStatus == StatusAtendimento.Finalizado){
                throw new RuntimeException("ERRO: não é possível finalizar um atendimento cancelado");
            }
            atendimento.setStatus(novoStatus);
        }
    }
}