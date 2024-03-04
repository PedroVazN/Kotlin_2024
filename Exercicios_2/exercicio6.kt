fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val quadrados = numeros.map { x -> x * x }

    val palavras = listOf("Maça", "Banana", "Pera")
    val palavrasMaisculas = palavras.map { s -> s.uppercase() }

    val nomesDeEx = setOf("Lilian", "Edvane", "Karina", "Julia Soares")
    val nomesDeExMaisucula = nomesDeEx.map { s -> s.uppercase() }

    val aluno = mapOf("Arthur" to 100, "Nathan" to 100, "Eduardo" to 80)
    val notas = aluno.map { it.key.uppercase() }
    
    val impares = numeros.filte( { x -> ((x % 2) != 0 )} )
    
    val peras = palavras.filter( { s -> s == "Pera"})

    println(quadrados)
    println(palavrasMaisculas)
    println(nomesDeExMaisucula)
    println(notas)
    println(impares)
    println(peras)
}
