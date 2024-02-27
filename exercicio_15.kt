//Classes de dados
//Classe para armazenar dados
//que contém alguns métodos (funções membro)
//convenientes para lidar com dados

data class Usuario(val nome: String, val id: Int)

//O método .toString() imprime uma string legível da instância da classe e 
//suas propriedades
//O método .equals() compara duas instâncias de classes
//O método .copy() cria uma nova instância a partir de outra já existente

fun main(){
    val fulanu = Usuario(nome = "fulanu", id = 1)
    println(fulanu)
    val cricrano = Usuario(nome = "cricano", id = 2)
    println(cricrano)
    val string = cricrano.toString()
    println(string)

    val beltrano = Usuario(nome = "beltrano", id = 3)
    
    println("${fulanu == cricrano}")
    val creusa = fulanu.copy()
    println ( creusa == fulanu)
    println ( creusa.equals(fulanu))
}