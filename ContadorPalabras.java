import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra en minúsculas: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        // Recorremos cada carácter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            // Verificamos si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        sc.close();
    }
}