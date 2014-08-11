package todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(method = GET)
    public Iterable<Todo> showTodoList() {
        return todoService.findAllList();
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Todo showATodo(@PathVariable(value = "id") Long id) {
        return todoService.findById(id);
    }

    @RequestMapping(method = POST)
    public Todo create(@RequestBody Todo newTodo) {
        return todoService.createNewTodo(newTodo);
    }

    @RequestMapping(value = "/{id}" ,method = DELETE)
    public void delete(@PathVariable("id") Long id){
        todoService.delete(id);
    }

    @RequestMapping(value = "/{id}" , method = PUT)
    public Todo update(@RequestBody Todo updateTodo, @PathVariable("id") Long id){
        return todoService.updateTodo(updateTodo, id);
    }
}
