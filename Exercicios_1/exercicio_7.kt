fun main(){
    val frutas = setOf("banana", "laranja", "maçã", "maçã")
    val cestas = listOf("banana", "laranja", "maçã", "maçã")
    val balaio: MutableSet<String> = mutableSetOf("pera", "abacaxi", "umbu","umbu")
    println("No balaio há ${balaio.count()} frutas")//conta quantas frutas há no balaio
    println("banana" in balaio)//verifica se há banana no balaio
    balaio.remove("umbu")//remove umbu do balaio
    println(balaio)
    balaio.add("acerola") //acrescenta acerola ao balaio
    println(balaio)
    println(frutas)
    println(cestas)
    val fruteira = setOf("banana", "banana", "banana")
    fruteira = setOf("morango", "framboesa", "uva")
}