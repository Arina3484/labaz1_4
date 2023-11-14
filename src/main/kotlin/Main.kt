fun main() {
    println("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")

    val input = readLine()
    if (input != null) {
        val parts = input.split(" ")

        if (parts.size == 3) {
            val num1 = parts[0].toDoubleOrNull()
            val num2 = parts[1].toDoubleOrNull()
            val operator = parts[2]

            if (num1 != null && num2 != null) {
                val result = calculateResult(num1, num2, operator)
                println("Результат: $result")
            } else {
                println("Некорректные числа. Пожалуйста, введите вещественные числа.")
            }
        } else {
            println("Некорректный формат. Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        }
    } else {
        println("Ошибка ввода. Пожалуйста, введите корректные данные.")
    }
}

fun calculateResult(num1: Double, num2: Double, operator: String): Double {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else Double.NaN
        else -> Double.NaN
    }
}

