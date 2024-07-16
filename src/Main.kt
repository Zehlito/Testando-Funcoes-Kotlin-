//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite um valor: ")
    val numberOne = readln().toInt()
    println("Digite outro valor: ")
    val numberTwo = readln().toInt()


    println(soma(numberOne,numberTwo))
    println(sub(numberOne,numberTwo))
    println(multi(numberOne,numberTwo))
    println(div(numberOne,numberTwo))
}

fun soma(x: Int, y: Int) = x + y
fun sub(x: Int, y: Int) = x - y
fun multi(x: Int, y: Int) = (x * y).toDouble()
fun div(x: Int, y: Int) = (x / y).toDouble()