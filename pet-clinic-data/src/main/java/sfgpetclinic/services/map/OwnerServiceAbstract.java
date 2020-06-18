package sfgpetclinic.services.map;

import sfgpetclinic.model.Owner;
import sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceAbstract extends AbstractMapService<Long, Owner> implements CrudService <Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}