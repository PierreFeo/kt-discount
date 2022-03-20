package ru.netology

fun main() {
    val itemPrice = 10_010
    val itemCount = 11
    var musicLover = true

    val totalPrice = itemPrice * itemCount
    val discount = if (totalPrice > 1_000_000) {
        totalPrice * 0.95
    } else if (totalPrice > 100_000) {
        totalPrice - 10_000
    } else totalPrice

    val moreDiscount = if (musicLover) discount.toInt() * 0.01 else 0
    val allDiscount = discount.toInt() - moreDiscount.toInt()

    println("Ваша покупка на сумму - ${totalPrice / 100}")
    println("После применения 5% скидки - ${discount.toInt() / 100} рублей ${discount.toInt() % 100} копеек.")
    if (musicLover) println("После применения 1% скидки ${allDiscount / 100} рублей ${allDiscount % 100} копеек.")

}