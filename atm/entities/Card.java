package atm.entities;

public class Card {

    private String cardNumber;
    private String BIN;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public Card(String cardNumber, String BIN, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.BIN = BIN;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBIN() {
        return BIN;
    }

    public void setBIN(String BIN) {
        this.BIN = BIN;
    }

    public static class Builder {
        private String cardNumber;
        private String cardHolderName;
        private String expiryDate;
        private String cvv;
        private String BIN;

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setBIN(String BIN) {
            this.BIN = BIN;
            return this;
        }

        public Builder setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public Builder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setCvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        public Card build() {
            return new Card(cardNumber, BIN, cardHolderName, expiryDate, cvv);
        }
    }

}
