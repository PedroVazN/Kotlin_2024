class Cliente ( val id: Int, var email: String = "fulano@exemplo.com"){
    val categoria: String = "trabalho"
     fun imprimirEmail(){
        println(email)
    }
     fun imprimirId(){
        println(id)
    }
}

fun main(){
    val cliente = Cliente (1, "cicrano@exemplo.com")
    println(cliente.id)
    cliente.email = "cricano@alugmsite.com"
    println(cliente.email)
    
    println("A idade do cliente é ${cliente.id}, e o email é ${cliente.email}")
    cliente.imprimirId()
    cliente.imprimirEmail()
}
