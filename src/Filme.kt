class Filme(title: String?, private val qntMinutos: Int, var diretor: String) : Obra(title) {
    override fun tamanhoObra(): String {
        return "Duração do filme: " + qntMinutos + " minutos"
    }

    fun diretor(): String {
        return "Diretor: " + diretor
    }
}