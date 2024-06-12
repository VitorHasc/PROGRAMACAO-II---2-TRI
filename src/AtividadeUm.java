import java.util.Scanner;
import java.util.Random;
class Conta{
    Scanner ler = new Scanner(System.in);
    String titular;
    int indentificador;
    float saldo;

    void sacar (){
        System.out.println("Quanto você deseja sacar?");
        float num = ler.nextFloat();
        System.out.println("Você sacou R$" + num);
        saldo = saldo - num;
        System.out.println("Seu saldo na conta agora equivale a R$" + saldo);
    }

    void depositar (){
        System.out.println("Quanto você deseja depositar?");
        float num = ler.nextFloat();
        saldo = saldo+num;
        System.out.println("Você depositou R$" + num);
        System.out.println("Seu saldo agora equivale a R$" + saldo);
    }


}

public class AtividadeUm {
    public static void main(String[] args) {
        int auxcriacao = 0;
        Conta [] usuarios = new Conta[100];
        for(int aux=0 ; aux<1;){
            Scanner ler = new Scanner(System.in);
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Listar todas as contas");
            System.out.println("3 - Acessar uma conta");
            int opcao = ler.nextInt();

            if(opcao == 1) {
                Conta c1 = new Conta();
                System.out.println("Insira o titular");
                c1.titular = ler.next();
                c1.indentificador = new Random().nextInt(10000, 90000);
                System.out.println("Seu identificador é " + c1.indentificador);
                System.out.println("Insira o saldo da conta");
                c1.saldo = ler.nextFloat();
                usuarios[auxcriacao] = c1;
                auxcriacao++;
            }
            if(opcao == 2) {
                for(int aux2 = 0; aux2 < auxcriacao; aux2++ ){
                    System.out.println("-----------------");
                    System.out.println("Identificador: " + usuarios[aux2].titular);
                    System.out.println("Identificador: " + usuarios[aux2].indentificador);
                    System.out.println("Identificador: " + usuarios[aux2].saldo);
                }
                System.out.println("-----------------");
            }

            if(opcao == 3) {
                System.out.println("Insira o Indentificador da conta");
                int procurar = ler.nextInt();
                for(int aux3=0; aux3<auxcriacao; aux3++){
                    if(procurar == usuarios[aux3].indentificador){
                        System.out.println("-----------------");
                        System.out.println("Identificador: " + usuarios[aux3].titular);
                        System.out.println("Identificador: " + usuarios[aux3].indentificador);
                        System.out.println("Identificador: " + usuarios[aux3].saldo);
                        System.out.println("-----------------");
                        System.out.println("O que você deseja fazer?");
                        System.out.println("1 - Sacar");
                        System.out.println("2 - Depositar");
                        int opcao3 = ler.nextInt();
                        if( opcao3 == 1 ){
                            usuarios[aux3].sacar();
                        }
                        if ( opcao3 == 2 ){
                            usuarios[aux3].depositar();
                        }
                    }
                }
            }
        }
    }
}