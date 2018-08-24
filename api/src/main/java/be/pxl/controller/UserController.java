package be.pxl.controller;

import be.pxl.entity.User;
import be.pxl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {
    public static final String BASE_URL = "/user";

    @Autowired
    private IUserService service;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces="application/json;charset=utf-8")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {

        HttpStatus status = HttpStatus.OK;
        User user = service.getUser(id);

        if (user == null)
            status = HttpStatus.NOT_FOUND;

        return new ResponseEntity<User>(user, status);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json;charset=utf-8")
    public List<User> getAllUsers() {
        return service.AllUsers();
    }

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {

        service.addUser(user);
    }

    @RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id) {
        service.deleteUser(id);
    }
}
