// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

import java.util.UUID

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val id: UUID = UUID.randomUUID())

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val basico = Nivel.BASICO
    val intermediario = Nivel.INTERMEDIARIO
    val difícil = Nivel.DIFICIL

    val basicoIngles = ConteudoEducacional("Inglês Básico", 120)
    val intermediarioIngles = ConteudoEducacional("Inglês Intermediário", 120)
    val avancadoIngles = ConteudoEducacional("Inglês Avançado", 120)

    val basicoPortugues = ConteudoEducacional("Português Básico", 120)
    val intermediarioPortugues = ConteudoEducacional("Português Intermediário", 120)
    val avancadoPortugues = ConteudoEducacional("Português Avançado", 120)

    val formacaoIngles = Formacao("Inglês", listOf(basicoIngles, intermediarioIngles, avancadoIngles))
    val formacaoPortugues = Formacao("Português", listOf(basicoPortugues, intermediarioPortugues, avancadoPortugues))

    val aluno1 = Usuario()
    val aluno2 = Usuario()

    formacaoIngles.matricular(aluno1)
    formacaoPortugues.matricular(aluno2)

    println("Aluno1 matriculado na Formação de Inglês: ${formacaoIngles.inscritos.contains(aluno1)}")
    println("Aluno2 matriculado na Formação de Português: ${formacaoPortugues.inscritos.contains(aluno2)}")
}