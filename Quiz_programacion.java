import java.util.Scanner;

public class Quiz_programacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();
        if (primerNumero % segundoNumero == 0) {
            System.out.println(primerNumero + " es múltiplo de " + segundoNumero);
        } else if (segundoNumero % primerNumero == 0) {
            System.out.println(segundoNumero + " es múltiplo de " + primerNumero);
        } else {
            System.out.println(primerNumero + " no es múltiplo de " + segundoNumero +
                               " ni " + segundoNumero + " es múltiplo de " + primerNumero);
        }
    }
}
