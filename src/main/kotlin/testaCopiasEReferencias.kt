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