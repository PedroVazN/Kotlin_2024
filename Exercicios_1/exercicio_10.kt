fun soma( x: Int, y: Int) : Int {
    return x + y
}
 
fun dividir( x : Int, y : Int = 2) : Int{
    return (x / y)
}
 
//Função sem retorno
fun imprimirMensagem( mensagem: String){
    println(mensagem)
}
//O retorno é um valor Unit: Unit
//Funções com uma única expressão
fun subtrair( x: Int, y: Int) = x - y
 
fun main() {
    println( soma (1,2) ) //Argumento nomeado
    println( dividir( 4, 1) )
    imprimirMensagem("Alô!")
    println( subtrair( 10 , 5))
}