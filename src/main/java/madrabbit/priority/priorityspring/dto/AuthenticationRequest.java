package madrabbit.priority.priorityspring.dto;

public class AuthenticationRequest {

    private String email;
    private String password;

    public AuthenticationRequest(String email, String password) {
        System.out.println("auth requrst created");
        this.email = email;
        this.password = password;
    }

    public AuthenticationRequest() {
        System.out.println("auth requrst created");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
