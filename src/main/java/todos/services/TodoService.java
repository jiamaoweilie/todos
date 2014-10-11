package todos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todos.model.Todo;
import todos.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Iterable<Todo> findAllList(){
        return todoRepository.findAll();
    }
    public Todo createNewTodo(Todo todo){
        return todoRepository.save(todo);
    }
    public Todo findById(Long id){
        return todoRepository.findOne(id);
    }
    public void delete(Long id){
        todoRepository.delete(id);
    }
    public Todo updateTodo(Todo todo, Long id){
        if(id != todo.getTodoId()) {
            todoRepository.delete(id);
        }
        return todoRepository.save(todo);
    }
}