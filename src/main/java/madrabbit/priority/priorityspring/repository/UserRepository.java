package madrabbit.priority.priorityspring.repository;

import madrabbit.priority.priorityspring.pojo.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users,Long> {

}
