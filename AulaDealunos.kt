data class Estudantes (val  primeiroNome: String, var nota: Double){

    constructor(primeiroNome: String, nota: Double, ano: Int): this(primeiroNome, nota) {
        This.ano
    }
    var primeiroNome = ""
    var ultimoNome = ""
    var ra = 0
    var nota = 0
    var ano = 0
    }
    fun printnomeCompleto() {
    println("$primeiroNome + $ultimoNome")
    }
    fun avalNota(): Int {
        val aprovado: nota
        if (nota >= 60) {
            println("você foi aprovado com a nota $nota")
            return 1
        } else {
            println("você foi reprovado com a nota $nota")
            return 0
        }
    }
    fun passouDeAno(): Int {
    if (nota >= 60)
        ano += 1
    println("Parabens")

    }
      }
        construtor(primeiroNome: String, nota: Doble, ano: Int )
        this(primeiroNome, nota){
            this.ano = ano

        }