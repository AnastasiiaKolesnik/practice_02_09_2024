// Класс для операции проверки баланса
public class CheckBalanceOperation implements BankOperation {
    private double balance;

    // Конструктор для инициализации баланса
    public CheckBalanceOperation(double balance) {
        this.balance = balance;
    }

    // Переопределение метода execute для проверки баланса
    @Override
    public void execute() {
        System.out.println("Your current balance is: " + balance);
    }
}
