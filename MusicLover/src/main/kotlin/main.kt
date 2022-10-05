fun main() {
    // сумма покупки
    val totalPrice: Double = 20_000.0
    // скидка при покупке от 1_000 рублей
    val discountStartVar1: Double = 1_000.0
    val discountVar1: Double = 100.0
    // скидка при покупке от 10_000 рублей
    val discountStartVar2: Double = 10_000.0
    val discountVar2: Double = 0.05
    // скидка для меломана
    val musicLover: Boolean = true
    val discountVar3: Double = 0.01

    // вычисление промежуточной суммы покупки в зависимости от первоначальной суммы с учетом скидки
    val intermediateResult: Double =
        if ((totalPrice > discountStartVar1) && (totalPrice <= discountStartVar2)) totalPrice - discountVar1
        else if (totalPrice > discountStartVar2) totalPrice - totalPrice * discountVar2
        else totalPrice

    // вычисление итоговой суммы покупки в зависимости от того, постоянный ли это покупатель
    val result = if (musicLover === true) intermediateResult - intermediateResult * discountVar3 else intermediateResult

    println("Покупка на сумму: $totalPrice рублей")
    println("Сумма покупки после применения скидок: $result рублей")
}