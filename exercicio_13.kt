fun main() {
    val obj = "Alô!"
    // when como instrução ( o else não é obrigátorio)
    when(obj){
        "1" -> println ("Um")
        "Alô!" -> println("Saudação")
        else -> println("Desconhecido")
    }
    //when como expressão( o else é obrigátorio)
    val resultado = when(obj){
        "1" ->  "Um"
        "Alô!" -> "Saudação"
        else -> "Desconhecido"
    }
    println(resultado)
    val temp = 25
    val descricao = when {
        temp < 20 -> "muito frio"
        temp < 22 -> "frio"
        temp < 25 -> "bom"
        else -> "quentinho"
    }
    println(descricao)
}