package madrabbit.priority.priorityspring.exceptions;

public class ContentNotFoundException extends RuntimeException{
    public ContentNotFoundException(Long id) {
        super("The student id '" + id + "' does not exist in our records");
    }

}
