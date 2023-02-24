public class Bank {
  private String customerName;
  private String customerEmail;
  private String customerPhone;
  private int accountBalance = 10000;
  private int accountNumber = 593102277;
  ;

  public String getCustomerName() {
    return customerName;
  }
  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void getAccountBalance() {
    System.out.print("I have $" + this.accountBalance);
  }

  public void getAccountNumber() {
    System.out.print(this.accountNumber);
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public void depositFunds(int value) {
    this.accountBalance += value;
  }

  public void withdrawFunds(int value) {
    this.accountBalance -= value;
  }
}

