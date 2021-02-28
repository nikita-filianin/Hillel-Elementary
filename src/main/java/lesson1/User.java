public class User extends Entity {

    private String role;

    public User(String firstName, String secondName, int age, String mail, String password) {
        super(firstName, secondName, age, mail, password);
        this.role = "USER";
    }
}
