package be.pxl.service;

import be.pxl.entity.Klas;
import be.pxl.entity.User;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.List;

@Configurable
public interface IKlasService {
    Klas getKlas(int id);
    List<Klas> getAll();
    void addKlas(Klas klas);
    void deleteKlas(int id);
    List<User> getUsersPerKlas(int id);

}
