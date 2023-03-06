package Emoticons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma mensagem:");
        String mensagem = scanner.nextLine();

        int qtdFeliz = contarEmoticons(mensagem, ":-)");
        int qtdTriste = contarEmoticons(mensagem, ":-(");

        if (qtdFeliz > qtdTriste) {
            System.out.println("Feliz");
        } else if (qtdTriste > qtdFeliz) {
            System.out.println("Triste");
        } else {
            System.out.println("Neutro");
        }
    }

    public static int contarEmoticons(String mensagem, String emoticon) {
        int index = 0;
        int count = 0;
        while (index != -1) {
            index = mensagem.indexOf(emoticon, index);
            if (index != -1) {
                count++;
                index += emoticon.length();
            }
        }
        return count;
    }
