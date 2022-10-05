fun main() {
    // переменные комиссии и минимальной суммы перевода
    val comission = 0.0075
    val min = 35

    // переменная для хранения суммы перевода
    val amount = 100

    val result = if (amount > min) amount * comission else "СУММА ПЕРЕВОДА МЕНЬШЕ МИНИМАЛЬНОЙ"
    println("Комиссия за перевод $amount рублей составила: $result рублей")
}