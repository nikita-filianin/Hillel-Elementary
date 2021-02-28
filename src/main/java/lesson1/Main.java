public class Main {

    public static void main(String[] args) throws Exception {
        Entity user = new User("Nikita", "Filianin", 18,
                "nikita.filianin18@mail.com", "123");
        Entity admin = new Admin("Sergey", "Filianin", 30,
                "sergey.filianin30@mail.com", "456");

        Service userService = new UserService();
        Service adminService = new AdminService();

        userService.writeUser(user);
        userService.writeUser(admin);

        adminService.writeUser(user);
        adminService.writeUser(admin);

        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
    }
}
