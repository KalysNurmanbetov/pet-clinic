package kg.kalys.petclinic.services;

import kg.kalys.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    void save(Vet vet);

    Set<Vet> findAll();
}
