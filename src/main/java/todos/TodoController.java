package todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Configuration
@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @RequestMapping(method = GET)
    public Iterable<Todo> showTodoList() {
        return todoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Todo showATodo(@PathVariable(value = "id") Long id) {
        return todoRepository.findOne(id);
    }

    @RequestMapping(method = POST)
    public Todo create(@RequestBody Todo newTodo) {
        return todoRepository.save(newTodo);
    }

    @RequestMapping(value = "/{id}" ,method = DELETE)
    public void delete(@PathVariable("id") Long id){
        todoRepository.delete(id);
    }

    @RequestMapping(value = "/{id}" , method = PUT)
    public Todo update(@RequestBody Todo updateTodo, @PathVariable("id") Long id){
        if(id != updateTodo.getId()){
            todoRepository.delete(id);
        }
        return todoRepository.save(updateTodo);
    }
}
