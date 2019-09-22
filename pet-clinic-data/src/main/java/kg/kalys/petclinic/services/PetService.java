package kg.kalys.petclinic.services;

import kg.kalys.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
