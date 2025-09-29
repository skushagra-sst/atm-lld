package atm.services.NFSService;

import atm.entities.Card;
import atm.enums.TransactionCode;

public class NFSService {

    public TransactionCode initiateWithdrawal(Card card, double amount) {
        return (amount > 10000) ? TransactionCode.INSUFFICIENT_FUNDS : TransactionCode.SUCCESS;
    }

}
