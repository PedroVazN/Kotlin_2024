fun main() {
    // Botão Ação
    // A    Sim
    // B    Não
    // X    Menu
    // Y    Nada
    // Outro Não existe este Botão
    // Usando when como expressão, escreva um progama que imrprima como saída 
    // A ação e função do botão apertando
    val botao = "A"

    println( when (botao){
        "A" -> "Sim"
        "B" -> "Não"
        "X" -> "Menu"
        "Y" -> "Nada"
        else -> "Não existe este Botão"
        }
    )
}