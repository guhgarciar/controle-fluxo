// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
    double mesada = 50.0;
    int indice = 0;
    while (mesada > 0){
        double valorDoce = valorAleatorio();

        if (valorDoce > mesada)
            valorDoce = mesada;

        System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");    
        mesada = mesada - valorDoce;
        indice++;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda mesada em doces");
    System.out.println("Joãozinho comprou ao todo: " + indice + " doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    } 
}