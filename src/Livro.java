public class Livro extends Obra{
    private int qntPaginas;
    private String autor;

    public Livro(String title, int qntPaginas, String autor) {
        super(title);
        this.qntPaginas = qntPaginas;
        this.autor = autor;
    }
    public String autor(){
        return "Autor: " + this.autor;
    };
    public String tamanhoObra(){
        return "Quantidade de páginas: " + this.qntPaginas;
    };
}
