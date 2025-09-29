import atm.ATM;
import atm.services.CardReader.CardReader;
import atm.services.CardReader.MagStripCardReader;

public class Main {

    /*
     * ATM must have the following features
     * 1. Card Reader
     * 2. Interface for entering pin
     * 3. Cash Dispenser
     * 4. Receipt Printer
     * 5. Validate the PIN number
     * 6. If pin correct connect to user bank account
     * 7. Enter amount to withdraw
     * 8. Validate the amount
     * - Check if it's a multiple of 100
     * - Verify if the amount is available in the account
     * - Check if the amount is available in the ATM
     * 9. If validations pass, it should dispense cash from the cash dispenser.
     * 10. If any validation fails, it should display an error message on the
     * screen.
     * 11. The ATM should be able to make requests to the bank account.
     * 12. It should support generating a mini account statement.
     * 13. It should allow users to change their PIN.
     * 14. The ATM should support all types of ATM cards.
     * 15. It should be able to handle different charges for transactions from other
     * banks.
     * 16. It should implement a cash dispensing strategy to minimize the number of
     * currency notes used.
     * 17. The ATM should allow users to check their account statement without
     * withdrawing money.
     */

    public static void main(String[] args) {

        CardReader cardReader = new MagStripCardReader();
        ATM atm = new ATM.Builder()
                .setCardReader(cardReader)
                .build();

        atm.checkBalance();

    }
}
