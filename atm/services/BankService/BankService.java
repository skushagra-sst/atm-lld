package atm.services.BankService;

import atm.entities.Account;
import atm.entities.Card;
import atm.entities.Statement;

public interface BankService {
    void processTransaction(Account account, double amount);

    double getAccountBalance(Account account);

    void deposit(Account account, double amount);

    void withdraw(Account account, double amount);

    Statement[] generateAccountStatement(Account account, String fromDate, String toDate);

    Statement[] generateMiniStatement(Account account);

    boolean validateAccount(String accountNumber, String IFSCCode);

    Account getAccountDetails(Card card);

}
