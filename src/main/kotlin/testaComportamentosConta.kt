fun testaComportamentosConta() {
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

    if (contaFran.transfere(destino = contaAlex, valor = 100.0)) {
        println("Tranferência realizada com sucesso!")
    } else {
        println("Falha na transferência")
    }
    println("SALDO ALEX ${contaAlex.saldo}")
    println("SALDO FRAN ${contaFran.saldo}")
}