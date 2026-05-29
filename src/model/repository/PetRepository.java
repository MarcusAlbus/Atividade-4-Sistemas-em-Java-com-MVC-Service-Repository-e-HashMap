package model.repository;

import model.entity.Pet;
import java.util.HashMap;

public class PetRepository {

    private HashMap<Integer, Pet> pets = new HashMap<>();

    public void salvar(Pet pet){
        pets.put(pet.getId(), pet);
    }

    public Pet buscarPorId(int id) {
        return pets.get(id);
    }

    public HashMap<Integer, Pet> listarTodos(){
        return pets;
    }

    public boolean remover(int id){
        return pets.remove(id) != null;
    }
}
