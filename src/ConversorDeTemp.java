import java.util.Scanner;

public class ConversorDeTemp {
    public static void main(String[] args) {
        String pergunta = "Deseja converter fahrenheit para celcius?";
        String input;
        double operacao;
        double fahrenheit;
        double celcius;

        Scanner scan = new Scanner(System.in);

        System.out.println(pergunta);
        input = scan.nextLine();

        if (input.equals("sim")) {

            System.out.println("Digite o valor em fahrenheit: ");
            fahrenheit = scan.nextInt();

            operacao = (fahrenheit - 32) / 1.8;

            System.out.println(fahrenheit+"° eh igual a " + operacao + "°C");

            
        } else {

            System.out.println("Digite o valor em celcius: ");
            celcius = scan.nextInt();

            operacao = celcius * 1.8 + 32;

            System.out.println(celcius+"C° eh igual a " + operacao + "°F");
        }


    }
}