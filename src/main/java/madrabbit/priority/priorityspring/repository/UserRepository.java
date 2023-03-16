package madrabbit.priority.priorityspring.repository;

import madrabbit.priority.priorityspring.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
