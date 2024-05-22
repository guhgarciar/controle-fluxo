import java.util.Scanner;
import java.util.Locale;

public class TestandoUmaIdeia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome do primeiro amigo: ");
        String amigoPrimeiro = scanner.next();

        System.out.println("Digite o nome do segundo amigo: ");
        String amigoSegundo = scanner.next();

        System.out.println("Digite o nome do terceiro amigo: ");
        String amigoTerceiro = scanner.next();

        System.out.println("Digite o nome do quarto amigo: ");
        String amigoQuarto = scanner.next();

        System.out.println("Digite o nome do quinto amigo: ");
        String amigoQuinto = scanner.next();

        String amigos[] = {amigoPrimeiro, amigoSegundo, amigoTerceiro, amigoQuarto, amigoQuinto};

        for (int indice = 0; indice < amigos.length; indice++){
            switch (indice) {
                case 0:
                    System.out.println("O primeiro amigo é: " + amigos[indice]);                    
                    break;
                case 1:
                    System.out.println("O segundo amigo é: " + amigos[indice]);
                    break;
                case 2:
                    System.out.println("O terceiro amigo é: " + amigos[indice]);
                    break;
                case 3:
                    System.out.println("O quarto amigo é: " + amigos[indice]);
                    break;
                case 4:
                    System.out.println("O quinto amigo é: " + amigos[indice]);
                    break;
                default:
                    System.out.println("Esse não é seu amigo!");
                    break;
            }
        }
    }
}