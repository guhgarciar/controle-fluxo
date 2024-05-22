import java.util.Random;

public class ExemploDoWhile{
    public static void main(String[] args) {
        System.out.println("Discando...");
        int indice = 0;

        do
        {
            System.out.println("Telefone tocando...");
            indice++;

        }while (tocando());

        System.out.println("Alô !!!");
        
        if (indice == 1)
        System.out.println("O telefone tocou " + indice + " vez");

        else
        System.out.println("O telefone tocou " + indice + " vezes");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}