package atm.states.CardReaderState;

import atm.entities.Card;

public class MagStripCardReaderEjected implements CardReaderState {

    @Override
    public void insertCard() {
        System.out.println("Card inserted. . .");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public Card readCard() {
        System.out.println("No card to read. Please insert a card first.");
        return null;
    }

}
