class Account(initialBalance: Double, accountNumber: String) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Amount to deposit must be positive")
    balance += amount
    println(s"Deposited $amount. New balance: $balance")
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Amount to withdraw must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
    println(s"Withdrew $amount. New balance: $balance")
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    require(amount > 0, "Amount to transfer must be positive")
    require(amount <= balance, "Insufficient balance for transfer")
    balance -= amount
    targetAccount.balance += amount
    println(s"Transferred $amount to account ${targetAccount.accountNumber}. New balance: $balance")
  }

  def getBalance: Double = balance
}

object BankDemo {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0, "A12345")
    val account2 = new Account(-500.0, "B67890")
    val account3 = new Account(2000.0, "C54321")

    val bankAccounts = List(account1, account2, account3)

    // 4.1 List of Accounts with negative balances
    val negativeBalances = bankAccounts.filter(_.getBalance < 0)
    println("Accounts with negative balances:")
    negativeBalances.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))

    // 4.2 Calculate the sum of all account balances
    val totalBalance = bankAccounts.map(_.getBalance).sum
    println(s"Total balance of all accounts: $totalBalance")

    // 4.3 Calculate the final balances after applying interest
    def applyInterest(account: Account): Unit = {
      val interestRate = if (account.getBalance >= 0) 0.05 else 0.1
      val interest = account.getBalance * interestRate
      account.deposit(interest)
    }

    bankAccounts.foreach(applyInterest)

    println("Final balances after applying interest:")
    bankAccounts.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))
  }
}
