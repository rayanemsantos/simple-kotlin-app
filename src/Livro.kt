class Livro(title: String?, private val qntPaginas: Int, private val autor: String) : Obra(title) {
    fun autor(): String {
        return "Autor: " + autor
    }

    override fun tamanhoObra(): String {
        return "Quantidade de páginas: " + qntPaginas
    }
}