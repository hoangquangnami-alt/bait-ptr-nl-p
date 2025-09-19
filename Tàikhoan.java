class Account {
    private String accountId;
    private double balance;

    // Constructor
    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Getter & Setter
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Xuất thông tin
    public void displayInfo() {
        System.out.println("Thong tin tai khoan:");
        System.out.println("- Ma so tai khoan: " + accountId);
        System.out.println("- So tien: " + balance);
    }

    // Main test
    public static void main(String[] args) {
        Account acc = new Account("123456", 1000000);
        acc.displayInfo();

        acc.setBalance(800000);
        acc.displayInfo();
    }
}
