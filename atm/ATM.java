package atm;

import atm.entities.Card;
import atm.services.CardReader.CardReader;

public class ATM {

    private CardReader cardReader;

    public ATM() {
    }

    public void showMiniStatement() {
    }

    public void changePin() {
    }

    public void withdrawAmount() {
    }

    public void checkBalance() {
        Card c = cardReader.readCard();
        System.out.println(c.getCardHolderName());
    }

    public static class Builder {

        private CardReader cardReader;

        public Builder setCardReader(CardReader cardReader) {
            this.cardReader = cardReader;
            return this;
        }

        public ATM build() {
            ATM atm = new ATM();
            atm.cardReader = this.cardReader;
            return atm;
        }
    }

}
