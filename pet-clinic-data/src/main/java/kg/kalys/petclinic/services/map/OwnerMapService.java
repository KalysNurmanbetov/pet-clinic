package kg.kalys.petclinic.services.map;

import kg.kalys.petclinic.model.Owner;
import kg.kalys.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return super.findAll().stream()
                .filter(owner -> lastName.equals(owner.getLastName()))
                .collect(Collectors.toSet());
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
