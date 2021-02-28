public class Entity {

    private String firstName;
    private String secondName;
    private int age;
    private String mail;
    private String password;

    public Entity(String firstName, String secondName, int age, String mail, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public String getMail() {
        return mail;
    }
    public String getPassword() {
        return password;
    }
}
