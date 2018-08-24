package be.pxl.entity;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name="klas")
public class Klas {
    @Id
    private int id;
    @OneToMany(targetEntity = User.class)
    private Collection<User> users;

    public Klas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
