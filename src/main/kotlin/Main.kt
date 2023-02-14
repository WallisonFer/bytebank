fun main() {
    println("Bem vindo ao ByteBank")
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("Autenticou com sucesso!")
    }else{
        println("Falha na autenticação!")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")
    println("PLR: ${gui.plr}")

    if(gui.autentica(4000)){
        println("Autenticou com sucesso!")
    }else{
        println("Falha na autenticação!")
    }

}
