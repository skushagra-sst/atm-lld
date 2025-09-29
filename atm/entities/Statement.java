package atm.entities;

public record Statement(String accountNumber, String date, String description, double amount, double balance) {
    public String generateStatement() {
        return String.format("Date: %s | Description: %s | Amount: %.2f | Balance: %.2f",
                date, description, amount, balance);
    }

    @Override
    public String toString() {
        return generateStatement();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

}