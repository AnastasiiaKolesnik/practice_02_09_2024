// Класс для операции снятия средств
public class WithdrawMoneyOperation implements BankOperation {
    private double balance;
    private double amount;

    // Конструктор для инициализации баланса и суммы снятия
    public WithdrawMoneyOperation(double balance, double amount) {
        this.balance = balance;
        this.amount = amount;
    }

    // Переопределение метода execute для снятия средств
    @Override
    public void execute() {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}
