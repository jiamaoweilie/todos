package todos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todos.model.Todo;
import todos.model.User;
import todos.services.UserService;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = GET)
    public Iterable<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @RequestMapping(method = POST)
    public User create(@RequestBody User newUser) {
        return userService.createNewUser(newUser);
    }

    @RequestMapping(value = "/{id}", method = GET)
    public User findById(@PathVariable(value = "id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/{id}/todos")
    public Iterable<Todo> findTodoListForUser(@PathVariable(value = "id") Long id) {
        return userService.findById(id).getTodoList();
    }

    @RequestMapping(value = "/{id}/todos/{todoId}")
    public Todo findTodoByID(@PathVariable(value = "id") Long id, @PathVariable(value = "todoId") int todoId) {
        return userService.findById(id).getTodoList().get(todoId - 1);
    }
}
