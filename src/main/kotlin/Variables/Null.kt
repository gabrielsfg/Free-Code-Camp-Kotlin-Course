package Variables

fun main() {
    //Para atribuir variaveis nulas vc deve atribuir um "?" apos o tipo da variavel
    var vazio: String? = null
    val text: String? = "gabriel"

    if (text != null)
        println(text.length)

    //Outra forma de printar uma variavel q pode ser nula --> "?."
    println(vazio?.length)
    println(text?.length)

    val text2: String = text ?: "The variable is null"
    /*Se a varialvel text for vazia ele define text2 com a string dps dos 2 pontos se text tiver um valor ele define
    text2 com o valor anterior de text
     */
    println(text2)
}