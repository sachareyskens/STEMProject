package be.pxl.service;

import be.pxl.entity.Klas;
import be.pxl.entity.User;
import be.pxl.repository.KlasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KlasService implements IKlasService {
    @Autowired
    private KlasRepository repo;
    @Override
    public Klas getKlas(int id) {
        return repo.findOne(id);
    }

    @Override
    public List<Klas> getAll() {
        return repo.findAll();
    }

    @Override
    public void addKlas(Klas klas) {
        repo.save(klas);
    }

    @Override
    public void deleteKlas(int id) {
        repo.delete(id);
    }

    @Override
    public List<User> getUsersPerKlas(int id) {
        return repo.findUsersPerKlas(id);
    }
}
