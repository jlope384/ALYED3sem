import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * The Main class is the entry point of the program.
 * It contains the main method that executes the translation process.
 */
/**
 * The Main class is the entry point of the program. It contains the main method
 * that executes the translation process.
 */
public class Main {
    public static void main(String[] args) {
        Traductor traductor = new Traductor();
        BinaryTree Ingles = traductor.getTree1();
        BinaryTree Espanol = traductor.getTree2();
        BinaryTree Frances = traductor.getTree3();

        String text = new FileReader().getContent();
        List<String> words = Arrays.stream(text.split("\\s+")).map(String::toLowerCase).collect(Collectors.toList());

        List<String> traduccion = new ArrayList<>();
        System.out.println("Texto original: " + text);
        int language = -1;
        
        for (String word : words) {
            if (Ingles.search(word) != null) {
                language = 0;
                break;
            } else if (Espanol.search(word) != null) {
                language = 1;
                break;
            } else if (Frances.search(word) != null) {
                language = 2;
                break;
            }
        }

        if (language == -1) {
            System.out.println("No se pudo detectar el idioma del texto.");
            return;
        }

        Scanner in = new Scanner(System.in);
        int op = -1;
        switch (language) {
            case 0:
                System.out.println("El lenguaje es Ingles");
                System.out.println("Desea traducir a Español(0) o Frances(1)?");
                op = readOption(in);
                break;
            case 1:
                System.out.println("El lenguaje es Español");
                System.out.println("Desea traducir a Ingles(0) o Frances(1)?");
                op = readOption(in);
                break;
            case 2:
                System.out.println("El lenguaje es Frances");
                System.out.println("Desea traducir a Ingles(0) o Español(1)?");
                op = readOption(in);
                break;
        }
        in.close();

        for (String word : words) {
            String translatedWord = translateWord(word, language, op, Ingles, Espanol, Frances);
            traduccion.add(translatedWord);
        }

        System.out.println("Texto traducido: " + String.join(" ", traduccion));
    }

    private static int readOption(Scanner in) {
        int op;
        while (true) {
            op = in.nextInt();
            if (op == 0 || op == 1) {
                break;
            } else {
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }
        return op;
    }

    private static String translateWord(String word, int language, int op, BinaryTree Ingles, BinaryTree Espanol, BinaryTree Frances) {
        String translatedWord = "";
        switch (language) {
            case 0:
                translatedWord = translateWordInTree(word, op, Ingles);
                break;
            case 1:
                translatedWord = translateWordInTree(word, op, Espanol);
                break;
            case 2:
                translatedWord = translateWordInTree(word, op, Frances);
                break;
        }
        return translatedWord;
    }

    private static String translateWordInTree(String word, int op, BinaryTree tree) {
        List<String> translation = tree.search(word);
        if (translation != null) {
            String translatedWord = translation.get(op);
            return Character.toUpperCase(translatedWord.charAt(0)) + translatedWord.substring(1);
        } else {
            return "*" + Character.toUpperCase(word.charAt(0)) + word.substring(1) + "*";
        }
    }
}
