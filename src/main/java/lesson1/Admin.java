public class Admin extends Entity {

    private String role;

    public Admin(String firstName, String secondName, int age, String mail, String password) {
        super(firstName, secondName, age, mail, password);
        this.role = "ADMIN";
    }
}