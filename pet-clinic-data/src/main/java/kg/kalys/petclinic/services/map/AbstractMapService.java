package kg.kalys.petclinic.services.map;

import kg.kalys.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<Type extends BaseEntity, ID extends Long> {

    protected Map<Long, Type> map = new HashMap<>();

    Set<Type> findAll(){
        return new HashSet<>(map.values());
    }

    Type findById(ID id){
        return map.get(id);
    }

    Type save(Type obj){
        if(obj != null){
            if(obj.getId() == null){
                obj.setId(this.getNextId());
            }
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return map.put(obj.getId(), obj);
    }

    void delete(Type obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    void deleteById(ID id){
        map.remove(id);
    }


    private Long getNextId(){
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }

        return nextId;
    }
}
