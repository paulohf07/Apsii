import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro livro1 = new Livro();
        CD cd1 = new CD();
        System.out.println("=======Cadastro do Livro=======");

        System.out.println("Digite o nome do livro:");
        livro1.setNome(teclado.nextLine());

        System.out.println("Digite o preço do livro:");
        livro1.setPreco(teclado.nextDouble());

        teclado.nextLine();

        System.out.println("Digite o Autor do livro:");
        livro1.setAutor(teclado.nextLine());

        // Dados do CD
        System.out.println("==== Cadastro do CD ====");

        System.out.println("Digite o Nome do CD:");
        cd1.setNome(teclado.nextLine());

        System.out.println("Digite o preço do CD:");
        cd1.setPreco(teclado.nextDouble());

        System.out.println("Digite o numero da Faixa:");
        cd1.setNumFaixas(teclado.nextInt());

        // Exibiçao

        System.out.println("\n ==== Informações Do CD====");

        cd1.exibeInformacoes();

        teclado.close();





    }

}
