package example.forum.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.forum.domain.User;
import example.forum.jpa.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("count")
    public long getCount() {
        return repository.count();
    }

    @RequestMapping("")
    public List<User> getUsers() {
        return repository.findAll();
    }

}
