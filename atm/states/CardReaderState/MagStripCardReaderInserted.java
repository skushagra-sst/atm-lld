package atm.states.CardReaderState;

import atm.entities.Card;

public class MagStripCardReaderInserted implements CardReaderState {

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
        return null;
    }

}
