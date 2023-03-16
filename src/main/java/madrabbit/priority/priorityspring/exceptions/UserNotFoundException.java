package madrabbit.priority.priorityspring.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("The user id '" + id + "' does not exist in our records");
    }
}
