import java.util.Scanner;

public class AtividadeDois {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        int aux = 1;
        while(aux!=0) {
            System.out.println("digite um número");
            try{
                int num = ler.nextInt();
                aux=0;
            }
            catch (Exception error){
                System.out.println("deu ruim repete, erro: " + error);
                ler.next();
            }
        }
        int ola = divide(1, 0);
    }
    public static int divide (int n1, int n2){
        if(n2==0){
            throw new ArithmeticException("LOUCURA");
        }
        return 0;
    }
}

