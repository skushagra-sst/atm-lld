package atm.services.CardReader;

import atm.entities.Card;
import atm.states.CardReaderState.CardReaderState;
import atm.states.CardReaderState.MagStripCardReaderEjected;
import atm.states.CardReaderState.MagStripCardReaderInserted;

public class MagStripCardReader implements CardReader {

    private CardReaderState cardReaderState;

    public MagStripCardReader() {
        cardReaderState = new MagStripCardReaderEjected();
    }

    @Override
    public Card readCard() {
        this.cardReaderState.insertCard();
        this.cardReaderState = new MagStripCardReaderInserted();
        Card c = this.cardReaderState.readCard();

        return c;
    }

    public void ejectCard() {
        cardReaderState.ejectCard();
        this.cardReaderState = new MagStripCardReaderEjected();
    }

}
