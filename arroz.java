import java.util.Scanner;

public class arroz{
        public static void main(String []args){
            double valor1, valor2, valor3, media;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a primeira nota");
            valor1 = teclado.nextDouble();
            System.out.println("Digite a segunda nota");
            valor2 = teclado.nextDouble();
            System.out.println("Digite a terceira nota");
            valor3 = teclado.nextDouble();
                if(valor1 > 10){
                    System.out.println("O valor da primeira nota tem que ser menor que 10. Digite outro");
                    double reValor1 = teclado.nextDouble();
                    valor1 = reValor1;
                }
                if(valor2 > 10){
                    System.out.println("O valor da segunda nota tem que ser menor que 10. Digite outro");
                    double reValor2 = teclado.nextDouble();
                    valor2 = reValor2;
                }  
                if(valor3 > 10){
                    System.out.println("O valor da terceira nota tem que ser menor que 10. Digite outro");
                    double reValor3 = teclado.nextDouble();
                    valor3 = reValor3;
                }
            media = (valor1 + valor2 + valor3) / 3;
            teclado.close();
            System.out.println("Sua média é de: " + media + " pontos");

    }
}