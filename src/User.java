// Класс для обычного пользователя, который может только проверять баланс
public class User {
    private BankOperation operation;

    // Конструктор принимает операцию, которую пользователь может выполнять
    public User(BankOperation operation) {
        this.operation = operation;
    }

    // Метод для выполнения действия
    public void performOperation() {
        operation.execute();
    }
}
