import java.util.Scanner;
import java.util.ArrayList;


public class lab4 {
    static int accountNumber;
    static String accountHolderName;
    static double accountBalance;
    static int depositMoney;
    static int withdrawMoney;

    static ArrayList<String> transactionList = new ArrayList<>();
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeCustomer(scanner);
        int choice;
        do {
            System.out.println("\nPlease select an option:");
            System.out.println("1.inialize customer");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Print Transactions");
            System.out.println("5. Print Account Summary");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    initializeCustomer(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    printTransactions();
                    break;
                case 5:
                    printAccountSummary();
                    break;
                case 6:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
            }
        } while (choice != 5);
    }
    public static void initializeCustomer(Scanner scanner) {
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();
        System.out.print("Enter account balance: ");
        accountBalance = scanner.nextDouble();
        transactionList.add("Initial balance: " + accountBalance);
    }

    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to be deposited: ");
        double amount = scanner.nextDouble();
        accountBalance += amount;
        transactionList.add("Deposit: " + amount);
        System.out.println("Deposit successful. Updated balance: " + accountBalance);
    }

    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to be withdrawn: ");
        double amount = scanner.nextDouble();
        if (accountBalance >= amount) {
            accountBalance -= amount;
            transactionList.add("Withdrawal: " + amount);
            System.out.println("Withdrawal successful. Updated balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public static void printTransactions() {
        System.out.println("List of Transactions:");
        for (String transaction : transactionList) {
            System.out.println(transaction);
        }
    }

    public static void printAccountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
