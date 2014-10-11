package todos.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import todos.Application;
import todos.model.Todo;
import todos.model.User;

@WebAppConfiguration
@ActiveProfiles(value = "test")
@SpringApplicationConfiguration(classes = { Application.class })
public class TodoRepositoryTest {

    @Autowired
    TodoRepository todoRepository;

    @Test
    public void shouldSaveNewTodo() {
        User user = new User();
        user.setId(1);

        Todo todo = new Todo();
        todo.setDescription("this is a todo");
        todo.setCompleted(false);
        todo.setUser(user);

        todoRepository.save(todo);
    }

}