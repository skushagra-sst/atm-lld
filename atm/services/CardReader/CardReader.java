package atm.services.CardReader;

import atm.entities.Card;

public interface CardReader {

    Card readCard();

    void ejectCard();

}
