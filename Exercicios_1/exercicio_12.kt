fun main() {
    //Rangers (extensão, ou alcalse)
    //1, 2, 3, 4
    //1..<4
    //4,3,2,1
    //4 dowTo 1
    //1..5 step 2 == 1,3,5
    //'a'..'d' == a, b, c, d
    //'z' dowTo 's' step 2 == 'z', 'x', 'v', 't'
    for( n in 1..5){
        println(n)
    }
    val bolos = listOf("cenoura", "queijo", "chocolate")
    for(bolo in bolos){
        println("Nham, é um bolo de $bolo!")
    }
    var bolosComidos = 0
    while(bolosComidos < 3){
        println("Coma o bolo!")
        bolosComidos++
    }
    var bolosAssados = 0
    do {
        println("Asse um bolo!")
        bolosAssados++
    } while(bolosAssados < bolosComidos)
}