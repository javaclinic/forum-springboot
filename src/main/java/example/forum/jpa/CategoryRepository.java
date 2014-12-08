package example.forum.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import example.forum.domain.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
    List<Category> findByName(@Param("name") String name);
}
