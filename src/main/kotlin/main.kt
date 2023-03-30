fun main() {
    val amount: Int = 10_000
    val transferFee: Double = 0.0075

    val minimalComission = amount * transferFee
    val maxComission = amount - (amount * transferFee)
    val totalComission = if (minimalComission > 35) maxComission else amount - 35

    if (amount <= 35) {
        println("Сумма перевода должна быть больше 35 руб.")
    } else {
        println("Сумма комиссии: ${amount.minus(totalComission.toInt())} руб.")
    }
}