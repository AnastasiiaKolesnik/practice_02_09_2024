// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        // Обычный пользователь может только проверять баланс

        User user = new User(new CheckBalanceOperation(1000));
        System.out.println("User:");
        user.performOperation(); // Ожидается: "Your current balance is: 1000.0"

        // Администратор может как проверять баланс, так и снимать деньги
        Admin admin = new Admin(new CheckBalanceOperation(2000));
        System.out.println("Admin:");
        admin.performOperation(new WithdrawMoneyOperation(2000, 500)); // Ожидается: "Your current balance is: 2000.0" и "Withdrawal successful. Remaining balance: 1500.0"
    }
}
