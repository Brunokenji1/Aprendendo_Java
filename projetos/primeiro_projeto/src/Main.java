import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String letra = sc.nextLine();
        System.out.println(n1);
        System.out.println(letra);
        System.out.println("Circulo de fogo" + n1 + letra);

        boolean estaCorreto = true;

        //text box
        String sinopse = """
                Filme circulo de fogo
                filme de robos gigantes vs aliens
                """ + n1 + letra;
        //format
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);

        double n2 = 234.1232;
        System.out.printf("Valor: %.2f", n2);

        nome = "Test";
        int aulas = 5;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

    }
}