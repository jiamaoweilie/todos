package todos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todos.model.Todo;
import todos.model.User;
import todos.repository.TodoRepository;
import todos.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createNewUser(User newUser) {
        return userRepository.save(newUser);
    }

    public Iterable<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findOne(id);
    }
}
