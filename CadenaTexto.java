import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase: ");
        String texto = sc.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        sc.close();
    }
}
