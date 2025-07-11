import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int quantidade = entrada.nextInt();

        Product arroz = new Product("Arroz", 5, 10);
        System.out.println(arroz);
    }
}
