package OOP

fun main() {
    val account1: PersonAccount = PersonAccount("Gabriel")
    account1.deposit(500.00)
    account1.deposit(-500.50)
    account1.withdraw(350.50)
    account1.withdraw(-19.50)
    account1.withdraw(1500.00)
    account1.balance("Gabriel")
    account1.balance("Joao")

}

class PersonAccount(private var accountName: String) {
    private var balance: Double = 0.00
    private var transactions: MutableList<Double> = mutableListOf()

    fun deposit(value: Double) {
        if (value > 0) {
            balance += value
            transactions.add(value)
            println("You deposited: $value\n")
        } else {
            println("You cannot deposit a negative amount\n")
        }
    }

    fun withdraw(value: Double) {
        if (value < balance && value > 0) {
            balance -= value
            transactions.add(value * -1)
            println("You withdrew: $value\n")

        } else if (value > 0 && value > balance) {
            println("You cannot withdraw $value of your account because you only have $balance\n")
        } else {
            println("You cannot withdraw a negative amount\n")

        }
    }

    fun balance(name: String) {
        if (name == accountName) {
            println("The balance of $accountName is $balance \n")
            println("Your transactions history is: ")
            for (transaction in transactions) {
                println(transaction)
            }
        } else {
            println("This accountName doesn't exist")
        }
    }

}
