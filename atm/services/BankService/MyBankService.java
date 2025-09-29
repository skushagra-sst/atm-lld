package atm.services.BankService;

import atm.entities.Account;
import atm.entities.Card;
import atm.entities.Statement;

public class MyBankService implements BankService {

    @Override
    public void processTransaction(Account account, double amount) {

    }

    @Override
    public double getAccountBalance(Account account) {
        return 0;
    }

    @Override
    public void deposit(Account account, double amount) {

    }

    @Override
    public void withdraw(Account account, double amount) {

    }

    @Override
    public Statement[] generateAccountStatement(Account account, String fromDate,
            String toDate) {
        return new Statement[0];
    }

    @Override
    public Statement[] generateMiniStatement(Account account) {
        return new Statement[0];
    }

    @Override
    public boolean validateAccount(String accountNumber, String IFSCCode) {
        return false;
    }

    @Override
    public Account getAccountDetails(Card card) {
        return new Account("1234567890", "Kushagra S", "KUSH000891", Double.MAX_VALUE);
    }

}
