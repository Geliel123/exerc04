import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double not1;
        double not2;
        double not3;
        double not4;
        double media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        not1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        not2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        not3 = teclado.nextDouble();

        System.out.println("Digite a quarta nota: ");
        not4 = teclado.nextDouble();

        media = (not1 + not2 + not3 + not4) / 4;

        System.out.println("A media é :" + media);
    }
}
