import java.util.*;

public class Main {

    public static void main(String[] args) {
        InitializationData initialData = new InitializationData();
        Information information = new Information();

        System.out.println("Information after filling with initializer: ");
        System.out.println(initialData.initializer(information));

        System.out.println("Information after adding ten values: ");
        System.out.println(initialData.addTenValues(information));


        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(i);
        }
        List<Float> floats = new ArrayList<>();
        for (float i = 0; i < 2; i += 0.1) {
            floats.add(i);
        }

        List<Byte> bytes = new ArrayList<>();
        for (byte i = 0; i < Byte.MAX_VALUE - 100; i++) {
            bytes.add(i);
        }

        System.out.println("Result of additional method with <Integer>: ");
        System.out.println(addMethod(integers, information));
        System.out.println("Result of additional method with <Integer> & <Float>: ");
        System.out.println(addMethod(floats, information));
        System.out.println("Result of additional method with <Integer> & <Float> & <Byte>: ");
        System.out.println(addMethod(bytes, information));

    }

    private static Information addMethod(List<? extends Number> numbers, Information information) {

        for (int i = 0; i < numbers.size(); i++) {
            information.getNickname().add(String.valueOf(numbers.get(i)));

            if (!((information.getMail()).contains((numbers.get(i)) + "@mail.ua"))) {
                information.getMail().add((numbers.get(i)) + "@mail.ua");
                information.getNamedMail().put((numbers.get(i)) + "@mail.ua", "user" + i);
            }
        }

        return information;
    }
}