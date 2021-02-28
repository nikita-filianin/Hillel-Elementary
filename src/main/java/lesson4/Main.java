
import utils.StringHelper;
import utils.ValidHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        String firstString = "Nikita";
        char[] characters = {'F', 'i', 'l'};
        System.out.println(StringHelper.stringOperator(firstString, characters));

        ValidHelper.phoneValidator("+38(050) 769 19 59");
        ValidHelper.mailValidator("nikita@mail.ua");
        ValidHelper.dateOfBirthValidator("25.08.2002");
    }
}