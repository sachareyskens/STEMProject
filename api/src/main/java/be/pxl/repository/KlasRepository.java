package be.pxl.repository;

import be.pxl.entity.Klas;
import be.pxl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KlasRepository extends JpaRepository<Klas, Integer> {

    @Query("select users from Klas k where k.id = :klas")
    List<User> findUsersPerKlas(@Param("klas")int klas);
}
