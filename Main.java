public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.setCustomerName("Oscar");
    bank.setCustomerEmail("xxx@gmail.com");
    bank.setCustomerPhone("0900-000-000");

    System.out.println("I am " + bank.getCustomerName());
    bank.depositFunds(200000);
    bank.depositFunds(100000000);
    bank.getAccountBalance();
    System.out.println("====================");
    bank.withdrawFunds(80000000);
    bank.getAccountBalance();
  }
}