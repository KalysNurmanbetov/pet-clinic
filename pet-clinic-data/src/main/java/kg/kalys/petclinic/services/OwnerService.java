package kg.kalys.petclinic.services;

import kg.kalys.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Set<Owner> findByLastName(String lastName);
}
