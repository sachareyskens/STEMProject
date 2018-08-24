package be.pxl.service;

import be.pxl.entity.User;
import be.pxl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository repo;
    @Override
    public User getUser(int id) {
        return repo.findOne(id);
    }

    @Override
    public List<User> AllUsers() {
        return repo.findAll();
    }

    @Override
    public void addUser(User user) {
        repo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repo.delete(id);
    }
}
