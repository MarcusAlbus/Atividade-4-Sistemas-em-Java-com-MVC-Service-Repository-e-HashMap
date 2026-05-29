package model.service;

import model.entity.Pet;
import model.repository.PetRepository;

import java.util.HashMap;

public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository){

        this.petRepository = petRepository;

    }

    public void salvar(Pet pet){
        petRepository.salvar(pet);
    }

    public Pet buscarPorId(int id){

        Pet pet = petRepository.buscarPorId(id);
        if(pet == null){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else {
            return pet;
        }
    }

    public HashMap<Integer, Pet> listarTodos(){
        HashMap<Integer, Pet> list = petRepository.listarTodos();
        if(list.isEmpty()){
            throw new RuntimeException("ERRO: a lista está vazia");
        }else {
            return list;
        }
    }



}
