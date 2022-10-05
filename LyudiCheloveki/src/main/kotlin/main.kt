fun main() {
    // число лайков
    val likes = 111

    // переменная с окончанием слова
    val result = if (likes%10===1 && likes%100!==11) "человеку" else "людям"

    // вывод результата
    println("Понравилось $likes $result")
}