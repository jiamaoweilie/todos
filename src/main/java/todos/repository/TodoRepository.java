package todos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import todos.model.Todo;

@Component
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
