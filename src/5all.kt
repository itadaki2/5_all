fun main() {
    println("тут собраны все задание 5 лабы!!!")
    println("собрано Валерой с душой!")
    println("выберите задание (1-30): ")

    while (true) { // цикл для многократного выбора задания
        print("введите номер задания: ")
        val nomerZadaniya = readLine()!!.toIntOrNull()

        if (nomerZadaniya != null && nomerZadaniya in 1..30) { // проверка введенного номера
            when (nomerZadaniya) {
                1 -> zadanie1()
                2 -> zadanie2()
                3 -> zadanie3()
                4 -> zadanie4()
                5 -> zadanie5()
                6 -> zadanie6()
                7 -> zadanie7()
                8 -> zadanie8()
                9 -> zadanie9()
                10 -> zadanie10()
                11 -> zadanie11()
                12 -> zadanie12()
                13 -> zadanie13()
                14 -> zadanie14()
                15 -> zadanie15()
                16 -> zadanie16()
                17 -> zadanie17()
                18 -> zadanie18()
                19 -> zadanie19()
                20 -> zadanie20()
                21 -> zadanie21()
                22 -> zadanie22()
                23 -> zadanie23()
                24 -> zadanie24()
                25 -> zadanie25()
                26 -> zadanie26()
                27 -> zadanie27()
                28 -> zadanie28()
                29 -> zadanie29()
                30 -> zadanie30()
            }
            println("хотите выполнить другое задание? (УКАЗАТЬ да иили нет)")
            val otvet = readLine()!!.lowercase()
            if (otvet == "нет") {
                break // выпрыгиваем из цикла, если пользователь ввел нет
            }
        } else {
            println("увы такого задание нету и не будет попробуйте снова:)")
        }
    }
    println("спасибо за пользование!!!") // при выходе
}

fun zadanie1() {
    println("задание 1")
    for (chislo1 in 1..10) {
        println(chislo1)
    }
}

fun zadanie2() {
    println("задание 2")
    for (chislo1 in 2..20 step 2) {
        println(chislo1)
    }
}

fun zadanie3() {
    println("задание 3")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    var summa = 0
    for (chislo1 in 1..n) {
        summa += chislo1
    }
    println("сумма чисел от 1 до $n: $summa")
}

fun zadanie4() {
    println("задание 4")
    print("введите число: ")
    val chislo1 = readLine()!!.toInt()
    var faktorial = 1
    for (chislo2 in 1..chislo1) {
        faktorial *= chislo2
    }
    println("факториал числа $chislo1: $faktorial")
}

fun zadanie5() {
    println("задание 5")
    print("введите число: ")
    val chislo1 = readLine()!!.toInt()
    var prostoe = true
    if (chislo1 <= 1) {
        prostoe = false
    } else {
        for (chislo2 in 2 until Math.sqrt(chislo1.toDouble()).toInt() + 1) { // цикл до Math sqrt + 1
            if (chislo1 % chislo2 == 0) {
                prostoe = false
                break
            }
        }
    }
    if (prostoe) {
        println("число $chislo1 простое")
    } else {
        println("число $chislo1 не простое")
    }
}

fun zadanie6() {
    println("задание 6")
    for (chislo1 in 1..10) {
        for (chislo2 in 1..10) {
            println("$chislo1  $chislo2 = ${chislo1 * chislo2}") //  добавили
        }
        println()
    }
}


fun zadanie7() {
    println("задание 7")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    var chislo1 = 0
    var chislo2 = 1
    for (i in 0 until n) { // цикл от 0 до n - 1
        println(chislo1)
        val temp = chislo2
        chislo2 = chislo1 + chislo2
        chislo1 = temp
    }
}

fun zadanie8() {
    println("задание 8")
    print("введите первое число: ")
    val chislo1 = readLine()!!.toInt()
    print("введите второе число: ")
    val chislo2 = readLine()!!.toInt()
    var a = chislo1
    var b = chislo2
    while (b != 0) { // цикл пока b не равен 0
        val temp = b
        b = a % b
        a = temp
    }
    println("нод чисел $chislo1 и $chislo2: $a")
}

fun zadanie9() {
    println("задание 9")
    print("введите строку: ")
    val stroka = readLine()!!
    var obratnayaStroka = ""
    for (i in stroka.length - 1 downTo 0) {
        obratnayaStroka += stroka[i]
    }
    println("обратная строка: $obratnayaStroka")
}

fun zadanie10() {
    println("задание 10")
    print("введите число: ")
    val chislo1 = readLine()!!.toInt()
    var summa = 0
    var chislo2 = chislo1

    while (chislo2 != 0) { // цикл пока chislo2 не равен 0
        summa += chislo2 % 10
        chislo2 /= 10
    }
    println("сумма цифр числа $chislo1: $summa")
}
fun zadanie11() {
    println("задание 11")
    print("введите первую строку: ")
    val stroka1 = readLine()!!.lowercase()
    print("введите вторую строку: ")
    val stroka2 = readLine()!!.lowercase()

    if (stroka1.length != stroka2.length) {
        println("строки не являются анаграммами")
        return
    }

    val chars1 = stroka1.toCharArray().sortedArray() // сортируем символы первой строки
    val chars2 = stroka2.toCharArray().sortedArray() // сортируем символы второй строки

    if (chars1.contentEquals(chars2)) {
        println("строки являются анаграммами")
    } else {
        println("строки не являются анаграммами")
    }
}

fun zadanie12() {
    println("задание 12")
    print("введите начальное число: ")
    val nachalo = readLine()!!.toInt()
    print("введите шаг: ")
    val shag = readLine()!!.toInt()
    print("введите количество элементов: ")
    val kolvo = readLine()!!.toInt()
    for (i in 0 until kolvo) {
        println(nachalo + i * shag)
    }
}

fun zadanie13() {
    println("задание 13")
    for (chislo1 in 1..20) {
        println("${chislo1}^2 = ${chislo1 * chislo1}")
    }
}

fun zadanie14() {
    println("задание 14")
    for (i in 1..10) {
        println((1..100).random())
    }
}

fun zadanie15() {
    println("задание 15")
    print("введите строку: ")
    val stroka = readLine()!!.lowercase()

    val obratnayaStroka = stroka.reversed() // перевернутая строка
    if (stroka == obratnayaStroka) {
        println("строка является палиндромом")
    } else {
        println("строка не является палиндромом")
    }
}

fun zadanie16() {
    println("задание 16")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    var summa = 0
    for (i in 1..n) {
        summa += i * i
    }
    println("сумма квадратов чисел от 1 до $n: $summa")
}

fun zadanie17() {
    println("задание 17")
    print("введите строку: ")
    val stroka = readLine()!!
    for (i in 0 until stroka.length) {
        println(stroka[i])
    }
}

fun zadanie18() {
    println("задание 18")
    print("введите высоту лестницы: ")
    val vysota = readLine()!!.toInt()
    for (i in 1..vysota) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun zadanie19() {
    println("задание 19")
    print("введите количество чисел в массиве: ")
    val kolvo = readLine()!!.toInt()
    val massiv = IntArray(kolvo)
    println("введите числа массива:")
    for (i in 0 until kolvo) {
        massiv[i] = readLine()!!.toInt()
    }

    for (i in 0 until kolvo - 1) {
        for (j in i + 1 until kolvo) {
            if (massiv[i] > massiv[j]) {
                val temp = massiv[i]
                massiv[i] = massiv[j]
                massiv[j] = temp
            }
        }
    }

    println("отсортированный массив:")
    for (i in massiv) {
        print("$i ")
    }
}

fun zadanie20() {
    println("задание 20")
    print("введите начало диапазона: ")
    val nachalo = readLine()!!.toInt()
    print("введите конец диапазона: ")
    val konec = readLine()!!.toInt()

    for (chislo1 in nachalo..konec) {
        var prostoe = true
        if (chislo1 <= 1) {
            prostoe = false
        } else {
            for (chislo2 in 2 until Math.sqrt(chislo1.toDouble()).toInt() + 1) {
                if (chislo1 % chislo2 == 0) {
                    prostoe = false
                    break
                }
            }
        }
        if (prostoe) {
            println(chislo1)
        }
    }
}
fun zadanie21() {
    println("задание 21")
    print("введите год: ")
    val god = readLine()!!.toInt()
    print("введите месяц: ")
    val mesyac = readLine()!!.toInt()

    val kolvoDneyVMesyace = when (mesyac) {
        2 -> if (god % 4 == 0 && (god % 100 != 0 || god % 400 == 0)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }

    for (den in 1..kolvoDneyVMesyace) {
        println("$den.$mesyac.$god")
    }
}

fun zadanie22() {
    println("задание 22")
    val chislo1 = (1..100).random()
    var popast = false

    println("угадай число от 1 до 100")
    while (!popast) {
        print("введите число: ")
        val vvod = readLine()!!.toInt()

        when {
            vvod > chislo1 -> println("меньше")
            vvod < chislo1 -> println("больше")
            else -> {
                println("угадал!")
                popast = true
            }
        }
    }
}

fun zadanie23() {
    println("задание 23")
    while (true) {
        print("введите первую цифру: ")
        val cifra1 = readLine()!!.toInt()
        print("введите вторую цифру: ")
        val cifra2 = readLine()!!.toInt()

        print("выберите операцию (+, ): ")
        val operaciya = readLine()!!.lowercase()

        val rezultat = when (operaciya) {
            "+" -> cifra1 + cifra2
            "" -> cifra1 * cifra2
            else -> {
                println("неправильная")
                continue
            }
        }
        println("результат: $rezultat")

        print("введите стоп чтобы выйти или любую другую клавишу чтобы продолжить: ")
        val otvet = readLine()!!.lowercase()
        if (otvet == "стоп") {
            break
        }
    }
}

fun zadanie24() {
    println("задание 24")
    print("введите количество строк: ")
    val stroki = readLine()!!.toInt()
    print("введите количество столбцов: ")
    val stolby = readLine()!!.toInt()
    val matriza = Array(stroki) { IntArray(stolby) } // создаем матрицу

    println("введите элементы матрицы:")
    for (i in 0 until stroki) {
        for (j in 0 until stolby) {
            matriza[i][j] = readLine()!!.toInt()
        }
    }

    println("транспонированная матрица:")
    for (j in 0 until stolby) {
        for (i in 0 until stroki) {
            print("${matriza[i][j]} ")
        }
        println()
    }
}


fun zadanie25() {
    println("задание 25")
    for (chislo1 in 1..10) {
        println("${chislo1}^3 = ${chislo1 * chislo1 * chislo1}")
    }
}

fun zadanie26() {
    println("задание 26")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    var summaChet = 0
    var summaNechet = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            summaChet += i
        } else {
            summaNechet += i
        }
    }
    println("сумма четных чисел: $summaChet")
    println("сумма нечетных чисел: $summaNechet")
}

fun zadanie27() {
    println("задание 27")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

fun zadanie28() {
    println("задание 28")
    print("введите количество чисел: ")
    val kolvo = readLine()!!.toInt()
    val massiv = IntArray(kolvo) // Объявляем массив
    println("введите числа:")
    for (i in 0 until kolvo) {
        massiv[i] = readLine()!!.toInt()
    }

    for (i in 0 until kolvo - 1) {
        for (j in i + 1 until kolvo) {
            if (massiv[i] > massiv[j]) {
                val temp = massiv[i]
                massiv[i] = massiv[j]
                massiv[j] = temp
            }
        }
    }

    println("отсортированный массив:")
    for (i in massiv) {
        print("$i ")
    }
}

fun zadanie29() {
    println("задание 29")
    print("введите число n: ")
    val n = readLine()!!.toInt()
    var summa = 0.0
    for (i in 1..n) {
        summa += 1.0 / i
    }
    println("сумма ряда: $summa")
}

fun zadanie30() {
    println("задание 30")
    print("введите целое число: ")
    val chislo1 = readLine()!!.toInt()
    var chislo2 = chislo1
    var dvoichnoeChislo = ""
    while (chislo2 > 0) {
        dvoichnoeChislo = (chislo2 % 2).toString() + dvoichnoeChislo
        chislo2 /= 2
    }
    println("двоичное представление: $dvoichnoeChislo")
}