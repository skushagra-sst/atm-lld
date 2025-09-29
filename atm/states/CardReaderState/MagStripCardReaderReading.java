package atm.states.CardReaderState;

import atm.entities.Card;

public class MagStripCardReaderReading implements CardReaderState {

    @Override
    public void insertCard() {
        System.out.println("Card is already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting the card...");
    }

    @Override
    public Card readCard() {
        System.out.println("Reading the card...");
        return new Card.Builder()
                .setCardNumber("1234-5678-9012-3456")
                .setCardHolderName("John Doe")
                .setExpiryDate("12/25")
                .setCvv("123")
                .build();
    }

}
