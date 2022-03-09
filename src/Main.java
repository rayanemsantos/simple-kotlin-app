import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        List <Filme> filmes = new ArrayList<Filme>();
        List <Livro> livros = new ArrayList<Livro>();

        filmes.add(new Filme("O iluminado", 120, ""));
        filmes.add(new Filme("O Poderoso Chefão", 120, ""));
        filmes.add(new Filme("Grease – Nos Tempos da Brilhantina.", 120, ""));
        filmes.add(new Filme("Indiana Jones e Os Caçadores da Arca Perdida.", 120, ""));
        filmes.add(new Filme("Rocky – Um Lutador.", 120, ""));

        livros.add(new Livro("Orgulho e Preconceito", 300, ""));
        livros.add(new Livro("Dom Casmurro", 300, ""));
        livros.add(new Livro("Crime e Castigo", 300, ""));
        livros.add(new Livro("A revolução dos bichos", 300, ""));
        livros.add(new Livro("Hamlet", 300, ""));
        livros.add(new Livro("O pequeno príncipe", 300, ""));

        System.out.println("Bem vindo à biblioteca virtual! Temos opções de livros e mídias. Selecione o que deseja:");
        System.out.println("1 - Livros");
        System.out.println("2 - Mídias");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() == 1){
            System.out.println("Você selecionou Livros. Veja nossas obras disponíveis:");
            for (int i = 0; i < livros.size(); i++)
            {
                System.out.println(i + 1 + " - " + livros.get(i).titulo);
            }
            System.out.println("Selecione uma opções e veja os detalhes: ");
            int index = scanner.nextInt() - 1;
            System.out.println(livros.get(index).titulo);
            System.out.println(livros.get(index).tamanhoObra());
            System.out.println(livros.get(index).autor());
        } else {
            System.out.println("Você selecionou Mídias. Veja nossas obras disponíveis:");
            for (int i = 0; i < filmes.size(); i++)
            {
                System.out.println(i + 1 + " - " + filmes.get(i).titulo);
            }
            System.out.println("Selecione uma opções e veja os detalhes: ");
            int index = scanner.nextInt() - 1;
            System.out.println(filmes.get(index).titulo);
            System.out.println(filmes.get(index).tamanhoObra());
            System.out.println(filmes.get(index).diretor());
        }
    }
}
