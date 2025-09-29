package atm.states.CardReaderState;

import atm.entities.Card;

public interface CardReaderState {

    void insertCard();

    void ejectCard();

    Card readCard();

}
