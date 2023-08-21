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

object AccountDemo {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0, "A12345")
    val account2 = new Account(1500.0, "B67890")

    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")

    account1.deposit(500.0)
    account1.withdraw(200.0)

    account1.transfer(300.0, account2)

    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")
  }
}
