package todos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import todos.model.User;

@Component
public interface UserRepository extends CrudRepository<User, Long> {
}
