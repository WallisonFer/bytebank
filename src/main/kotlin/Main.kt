fun main() {
    println("Bem vindo ao ByteBank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    println(contaAlex.titular)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 150.0
    println("Titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while(i < 5){
        val titular = "Alex $i"
        val numeroConta = 1000 * i
        val saldo = i + 10.0


        println("Titular: $titular")
        println("Numero conta: $numeroConta")
        println("Saldo: $saldo")
        println("")
        i++
    }


//    for (i in 5 downTo 1) {
//        if(i == 4){
//            break
//        }
//
//        val titular = "Alex $i"
//        val numeroConta = 1000 * i
//        var saldo = i + 10.0
//
//
//        println("Titular: $titular")
//        println("Numero conta: $numeroConta")
//        println("Saldo: $saldo")
//        println("")

//        testaCondicoes(saldo)
//        }
}
fun testaCondicoes(saldo:Double){
    when {
        saldo > 0.0 -> println("Conta está positiva!")
        saldo == 0.0 -> println("Conta está neutra")
        else -> println("Conta está negativa")
    }
}