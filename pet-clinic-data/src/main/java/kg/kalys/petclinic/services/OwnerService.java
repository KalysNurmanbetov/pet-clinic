package kg.kalys.petclinic.services;

import kg.kalys.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByID(Long id);

    void save(Owner owner);

    Set<Owner> findAll();
}
