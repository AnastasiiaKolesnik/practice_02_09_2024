// Класс для администратора, который может выполнять дополнительные операции
public class Admin extends User {

    // Конструктор принимает операцию, которую администратор будет выполнять
    public Admin(BankOperation operation) {
        super(operation); // Вызов конструктора базового класса User
    }

    // Перегруженный метод: администратор может выполнять не только одну операцию
    public void performOperation(BankOperation additionalOperation) {
        super.performOperation(); // Выполнение операции, переданной в конструкторе
        additionalOperation.execute(); // Выполнение дополнительной операции
    }
}
