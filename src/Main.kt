import java.util.*
import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val filmes: MutableList<Filme> = ArrayList()
        val livros: MutableList<Livro> = ArrayList()
        filmes.add(Filme("O iluminado", 120, ""))
        filmes.add(Filme("O Poderoso Chefão", 120, ""))
        filmes.add(Filme("Grease – Nos Tempos da Brilhantina.", 120, ""))
        filmes.add(Filme("Indiana Jones e Os Caçadores da Arca Perdida.", 120, ""))
        filmes.add(Filme("Rocky – Um Lutador.", 120, ""))
        livros.add(Livro("Orgulho e Preconceito", 300, ""))
        livros.add(Livro("Dom Casmurro", 300, ""))
        livros.add(Livro("Crime e Castigo", 300, ""))
        livros.add(Livro("A revolução dos bichos", 300, ""))
        livros.add(Livro("Hamlet", 300, ""))
        livros.add(Livro("O pequeno príncipe", 300, ""))
        println("Bem vindo à biblioteca virtual! Temos opções de livros e mídias. Selecione o que deseja:")
        println("1 - Livros")
        println("2 - Mídias")
        val scanner = Scanner(System.`in`)
        if (scanner.nextInt() == 1) {
            println("Você selecionou Livros. Veja nossas obras disponíveis:")
            for (i in livros.indices) {
                println(livros[i].titulo)
            }
            println("Selecione uma opções e veja os detalhes: ")
            val index = scanner.nextInt() - 1
            println(livros[index].titulo)
            println(livros[index].tamanhoObra())
            println(livros[index].autor())
        } else {
            println("Você selecionou Mídias. Veja nossas obras disponíveis:")
            for (i in filmes.indices) {
                println(filmes[i].titulo)
            }
            println("Selecione uma opções e veja os detalhes: ")
            val index = scanner.nextInt() - 1
            println(filmes[index].titulo)
            println(filmes[index].tamanhoObra())
            println(filmes[index].diretor())
        }
    }
}