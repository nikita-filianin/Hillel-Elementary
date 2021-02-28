import java.io.BufferedReader;
import java.io.FileReader;


public class UserService implements Service {

    public boolean checkUser(Entity entity) throws Exception {
        boolean result = false;
        BufferedReader reader = new BufferedReader(new FileReader("e-mails.txt"));
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
            if (line.equals(entity.getMail())) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void writeUser(Entity entity) {
        System.out.println("Нет доступа!");
    }
}
