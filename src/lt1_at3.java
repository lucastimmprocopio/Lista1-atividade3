import java.util.Scanner;
public class lt1_at3 {
    public static void main(String[] args) throws Exception {

        //Req_1: Solicitar a digitação de dois números;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("");
        System.out.print("Digite p segundo número: ");
        int y = sc.nextInt();
        sc.close();

        //Req_2: Imprimir a soma dos números.

        int soma = x + y;
        System.out.println("A soma dos dois números é:  " + soma);

        
    }
}
