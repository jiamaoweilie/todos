package todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Qualifier("todoRepository")
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
        if(id != todo.getId())
            todoRepository.delete(id);
        return todoRepository.save(todo);
    }
}
