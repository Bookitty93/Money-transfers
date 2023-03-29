fun main() {
    val amount: Int = 1050
    val transferFee: Double = 0.075

    val minimalComission = amount * transferFee
    val maxComission = amount - (amount * transferFee)
    val totalAmount = if (minimalComission > 35) maxComission else amount - 35

    if (amount <= 35) {
        println("Сумма перевода должна быть больше 35 руб.")
    } else {
        println("Сумма перевода: $totalAmount руб.")
    }
}