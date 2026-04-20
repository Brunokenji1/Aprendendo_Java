import br.com.bruk.modelos.Compra;
import br.com.bruk.modelos.Credito;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o limite do cartão");
            double limite = sc.nextDouble();
            String LimpaBuffer = sc.nextLine();
            Credito limiteCredito = new Credito(limite);
            String item = "";

            while (!item.equals("1")) {
                System.out.println("Digite a descrição da compra: ");
                item = sc.nextLine();
                System.out.println("Digite o valor da compra");
                double preco = sc.nextDouble();
                LimpaBuffer = sc.nextLine();
                System.out.println("");

                Compra compra = new Compra(item, preco);
                boolean operacaoRealizada = limiteCredito.lancaCompra(compra);

                if (operacaoRealizada) {
                    System.out.println("Compra Realizada!");
                    System.out.println(("Digite 1 para sair ou qualquer key para continuar"));
                    item = sc.next();
                    LimpaBuffer = sc.nextLine();
                }
                else{
                    System.out.println("Saldo Insuficiente!");
                    break;
                }

            }
            Collections.sort(limiteCredito.getListaDeCompras());

            System.out.println("***************************************");
            System.out.println("Produtos Comprados");
            for(Compra compra:limiteCredito.getListaDeCompras()){

                System.out.println(compra.toString());

            }
            System.out.println("***************************************");

        }catch (InputMismatchException e){
            System.out.println("Deu erro de valor");
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}