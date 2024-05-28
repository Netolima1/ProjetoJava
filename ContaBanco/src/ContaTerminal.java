import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

    
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " Que nome Feio da Porra!");
        System.out.println("Tem " + idade + " anos " + " ta Velha em !");
        System.out.println("Tua altura é " + altura + "cm " + " Tem nem tamanho");
        scanner.close();

        
    }
}
