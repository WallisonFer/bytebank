fun main() {
    println("Bem vindo ao ByteBank")

    val contaAlex = Conta(titular = "Alex", numero = 2002)
    contaAlex.deposita(200.0)
    println("Titular: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")

    val contaFran = Conta(titular = "Fran", numero = 1001)

    contaFran.deposita(300.0)
    println("Titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")




    println("Depositando na conta da Fran")
    contaFran.deposita(valor = 50.0)
    println(contaFran.saldo)

    println("Sacando na conta da Fran")
    contaFran.saque(valor = 50.0)
    println(contaFran.saldo)

    println("Transferindo valores de Fran para Alex")

    if (contaFran.transfere(destino = contaAlex , valor = 100.0)) {
        println("Tranferência realizada com sucesso!")
    } else {
        println("Falha na transferência")
    }
    println("SALDO ALEX ${contaAlex.saldo}")
    println("SALDO FRAN ${contaFran.saldo}")
}


class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0) {
//            saldo = valor
//        }
//    }

}


/*
fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX: $numeroX")
    println("NumeroY: $numeroY")

    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)



    println("Titular conta joão: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
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

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta está positiva!")
        saldo == 0.0 -> println("Conta está neutra")
        else -> println("Conta está negativa")
    }
}*/
