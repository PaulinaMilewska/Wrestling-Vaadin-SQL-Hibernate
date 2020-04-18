package vaadin.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaadin.model.Wrestler;
import vaadin.model.WrestlingOrganisationType;

import java.util.List;

@Service
public class WrestlerManager {

    WrestlerRepository repository;
    List<Wrestler> wrestlers;

    @Autowired
    public WrestlerManager(WrestlerRepository repository) {
        this.repository = repository;
    }

    public WrestlerManager() {
    }

    public List<Wrestler> getAll (){
        wrestlers = repository.findAll();
        return wrestlers;
    }

    public void addPerson(String name, WrestlingOrganisationType type, String image) {
        wrestlers = repository.findAll();
        Wrestler wrestler = new Wrestler();
        wrestlers.add(wrestler);
        wrestler.setName(name);
        wrestler.setWrestlingOrganisationType(type);
        wrestler.setImage(image);
        repository.save(wrestler);
    }
}

