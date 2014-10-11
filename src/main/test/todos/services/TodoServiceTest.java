package todos.services;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import todos.Application;
import todos.model.Todo;
import todos.model.User;
import todos.repository.TodoRepository;

import javax.transaction.Transactional;

@WebAppConfiguration
@ActiveProfiles(value = "test")
@Transactional
@TransactionConfiguration(defaultRollback = true)
@SpringApplicationConfiguration(classes = { Application.class })
public class TodoServiceTest {

    @Autowired
    TodoService todoService;

    @Mock
    TodoRepository todoRepository;

    @Test
    public void shouldSaveNewTodo() {
        User user = new User();
        user.setName("testUser");
        user.setId(1);

        Todo todo = new Todo();
        todo.setDescription("this is a todo");
        todo.setCompleted(false);
        todo.setUser(user);

        todoService.createNewTodo(todo);


    }
}