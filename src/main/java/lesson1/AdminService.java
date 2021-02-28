import java.io.*;

public class AdminService implements Service {

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
    public void writeUser(Entity entity) throws Exception {

        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("e-mails.txt", true)));
        writer.println(entity.getFirstName());
        writer.println(entity.getSecondName());
        writer.println(entity.getAge());
        writer.println(entity.getMail());
        writer.println(entity.getPassword());
        writer.flush();
        writer.close();
    }
}
