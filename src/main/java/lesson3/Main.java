import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Checker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        final String FROM = "from which you withdraw money";
        final String TO = "to which you transfer money";

        client.setAccount(enterAccount(FROM));
        String accountTo = enterAccount(TO);
        client.setSum(enterSum());

        TransactionService.moneyTransfer(client, accountTo);
        System.out.println("The sum was successfully transferred!");
    }

    private static String enterAccount(String fromTo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account ID " + fromTo + ": ");
        String account;
        while (true) {
            account = scanner.nextLine();
            try {
                Checker.wrongFieldLength(account);
                break;
            } catch (WrongFieldException e) {
                System.out.println("The account ID must consist of 10 characters! " +
                        "Try again!");
            }
        }
        return account;
    }

    private static Double enterSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sum: ");
        Double sum;
        while (true) {
            try {
                sum = scanner.nextDouble();
                Checker.wrongSum(sum);
                break;
            } catch (WrongSumException e) {
                System.out.println("The sum is incorrect! It should be less than 1000! " +
                        "Try again!");
            }
        }
        return sum;
    }
}