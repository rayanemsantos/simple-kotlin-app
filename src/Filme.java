public class Filme extends Obra{
    private int qntMinutos;
    public String diretor;

    public Filme(String title, int qntMinutos, String diretor) {
        super(title);
        this.qntMinutos = qntMinutos;
        this.diretor = diretor;
    }
    public String tamanhoObra(){
        return "Duração do filme: " + this.qntMinutos + " minutos";
    };
    public String diretor(){
        return "Diretor: " + this.diretor;
    };
}
