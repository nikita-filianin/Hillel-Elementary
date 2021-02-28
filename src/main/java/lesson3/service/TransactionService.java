
package service;

import entity.Client;
import util.Checker;

public class TransactionService {

    public static void moneyTransfer(Client client, String accountTo){

        String accountFrom = client.getAccount();
        Checker.equalsAccount(accountFrom, accountTo);
    }
}