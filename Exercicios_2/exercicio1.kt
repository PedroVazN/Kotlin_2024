fun main(){

    var stringNula: String? = null
    println(descreverString(stringNula))
    
}

fun descreverString(talvezString: String?) : String{
    if(talvezString != null && talvezString.length > 0){
        return "String de comprimento ${talvezString.length}"
    } else {
        return "String nula ou vazia"
        
    }
}

