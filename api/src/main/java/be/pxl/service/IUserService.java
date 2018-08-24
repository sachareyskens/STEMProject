package be.pxl.service;


import be.pxl.entity.User;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.List;

@Configurable
public interface IUserService {
    User getUser(int id);
    List<User> AllUsers();
    void addUser(User user);
    void deleteUser(int id);
}
