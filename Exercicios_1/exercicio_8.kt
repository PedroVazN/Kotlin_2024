fun main(){
    val menu = mapOf(
        "Suco de maçã" to 10, "Suco de kiwi" to 15 , "Suco de laranja" to 10)
        println(menu)
    val cardapio: MutableMap<String, Int> = mutableMapOf(
        "Misto" to 8, "Hambúrger" to 14, "Pão na chapa" to 4)
    println(cardapio)
    println("O valor do suco de kiwi é ${menu["Suco de kiwi"]}")
    println("Há ${menu.count()} itens do menu")
    cardapio.put("Queijo quente", 12)
    println(cardapio)
    cardapio.remove("Hambúrger")
    println(cardapio)
    println(cardapio.containsKey("Hambúrger"))
}