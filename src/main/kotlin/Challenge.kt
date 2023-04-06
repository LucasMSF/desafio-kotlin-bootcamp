// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String, var xp: Int = 0)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val dificuldade: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }

    override fun toString(): String {
        return "Formacao(nome='$nome', conteudos=$conteudos, inscritos=$inscritos)"
    }
}

fun main() {
    val lucas = Usuario("Lucas")
    val maria = Usuario("Maria")

    val kotlinExceptions = ConteudoEducacional("Tratamento de exceções com Kotlin", 120, Nivel.INTERMEDIARIO)
    val kotlinFunctions = ConteudoEducacional("Funções em Kotlin", 60, Nivel.BASICO)

    val kotlinBackend = Formacao("Kotlin Beck-end", listOf<ConteudoEducacional>(kotlinFunctions, kotlinExceptions))

    kotlinBackend.matricular(lucas, maria)

    println(kotlinBackend)
}