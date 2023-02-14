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


    for (i in 5 downTo 1) {
        if(i == 4){
            break
        }

        val titular = "Alex $i"
        val numeroConta = 1000 * i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero conta: $numeroConta")
        println("Saldo: $saldo")
        println("")

        testaCondicoes(saldo)
        }
}