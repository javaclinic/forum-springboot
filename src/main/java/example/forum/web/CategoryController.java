package example.forum.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.forum.domain.Category;
import example.forum.jpa.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @RequestMapping("count")
    public long getCount() {
        return repository.count();
    }

    @RequestMapping("")
    public List<Category> getCategories() {
        return repository.findAll();
    }

}
