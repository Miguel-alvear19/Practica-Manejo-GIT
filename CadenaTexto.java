import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de la cadena
        System.out.print("Ingresa una palabra o frase: ");
        String texto = sc.nextLine();

        // Variable para almacenar el resultado invertido
        String invertido = "";

        // Recorremos la cadena desde el final hacia el inicio
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        // Salida del resultado
        System.out.println("Texto invertido: " + invertido);

        sc.close();
    }
}
