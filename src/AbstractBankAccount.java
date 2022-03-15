//public abstract class AbstractBankAccount implements Account{
//  private String accountName;
//  private String bankName;
//  private Integer balance;
//
//  @Override
//  public Integer getBalance() {
//    return this.balance;
//  }
//
//  @Override
//  public Integer save(Integer amount) {
//    return this.balance + amount;
//  }
//
//  @Override
//  public Integer withdraw(Integer amount) {
//    return this.balance - amount;
//  }
//
//  @Override
//  public String getAccountName() {
//    return this.accountName;
//  }
//
//  @Override
//  public void printWelcomeMessage() {
//    System.out.printf("%s에 오신 것을 환영합니다. %s님!%n", getBankName(), getAccountName());
//  }
//
//  public String getBankName() {
//    return this.bankName;
//  }
//
//  abstract public BankConnection getConnection(Bank bank);
//}
