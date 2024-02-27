//EXPRESSÕES LAMBDA
 
//converter letras minúsculas em maicúslas
 
fun converterMaiuscula( s : String) : String {
    return s.uppercase()
}
/*fun main(){
    println(converterMaiuscula("kamehameha"))
    println( { s : String -> s.uppercase()}("kamehameha"))
}
*/
 
//Expressãp lambda pode ser:
//atribuida a uma variável
//passando como para outra função
//retornada por uma função
//auto-invocada
 
/*Atribuindo uma expressão lambda
fun main(){
    val maisculaConvertida = { s: String -> s.uppercase()}
    println(maisculaConvertida("zap"))
}
*/
//Passando uma expressão lambda para outra função
 
/*fun main(){
    val num = listOf(1,-2,3,-4,5,-6)
    val pos = num.filter ({ x -> x > 0 })
    val neg = num.filter ({ x -> x < 0 })
    println(pos)
    println(neg)
    val duplo = num.map ({x -> x * 2})
    val triplo = num.map ({x -> x * 3})
    println(duplo)
    println(triplo)

}
 
*/
 
//Retornando uma expressão lambda
 
/*
fun paraSegundos (tempo: String) : (Int) -> Int = when( tempo ){
    "hora" -> {valor -> valor * 60 * 60}
    "minuto" -> {valor -> valor * 60}
    "segundo" -> { valor -> valor }
    else -> {valor -> valor}
}
 
 
fun main(){
    val temposEmMinutos = listOf( 2, 10, 15, 1)
    val minPSeg = paraSegundos("minuto")
    val tempoTotalEmSegundos = temposEmMinutos.map(minPSeg).sum()
    println("O tempo total é $tempoTotalEmSegundos segundos")
}
*/
 
/*
fun main(){
    println({s: String -> s.uppercase()} ("Os dez mandamentos do amor"))
}
*/
 
fun main(){
    println(listOf(1,2,3).fold (0, {x, item -> x + item} ) )
    println(listOf(1,2,3).fold (0) {x, item -> x + item} ) 
}
 