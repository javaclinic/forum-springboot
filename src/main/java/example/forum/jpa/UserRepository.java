package example.forum.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import example.forum.domain.User;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByEmail(@Param("email") String email);
}
