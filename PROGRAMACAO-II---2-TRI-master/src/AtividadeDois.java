import java.util.Scanner;

class Teste {
    private String nome;

    public void setarnome () {
        Scanner ler = new Scanner (System.in);
        System.out.println();
        nome = ler.next();
    }
    public void showarnome () {
        System.out.println(nome);
    }
}

class AtividadeDois {
    public static void main(String [] args){
        System.out.println("insira um nomezinho java");
        Teste rodrigo = new Teste();
        rodrigo.setarnome();
        rodrigo.showarnome();
    }
}
