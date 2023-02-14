fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta está positiva!")
        saldo == 0.0 -> println("Conta está neutra")
        else -> println("Conta está negativa")
    }
}