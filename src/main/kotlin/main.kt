package ru.netology

fun main() {
    val amount: Int = 15_000
    val discount_1 = 100
    val discount_2: Int = (amount * 0.05).toInt()
    var customerCategory: Boolean = true


    var price: Int = 0
    if (amount > 0 && amount <= 1000) {
        price = (amount).toInt()
    } else if (amount > 1000 && amount <= 10_000) {
        price = (amount - discount_1).toInt()
    } else if (amount > 10_000) {
        price = (amount - discount_2).toInt()
    }

    var totalPrice: Int = 0
    if (customerCategory) {
        totalPrice = (price * 0.99).toInt()
    } else {
        totalPrice = price
    }
    println("Итоговая стоимость покупки: $totalPrice рублей")
}

