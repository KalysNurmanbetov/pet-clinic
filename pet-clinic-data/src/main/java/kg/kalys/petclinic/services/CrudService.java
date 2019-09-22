package kg.kalys.petclinic.services;

import java.util.Set;

public interface CrudService <Type, ID> {

    Type findById(ID id);

    Type save(Type obj);

    Set<Type> findAll();

    void delete(Type obj);

    void deleteById(ID id);
}
