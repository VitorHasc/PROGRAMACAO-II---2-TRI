class Funcionario {
    public Funcionario(String nome){
        this.nome = nome;
    }

    private String nome;

    public void getNome() {
        System.out.println(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
class Motorista extends Funcionario{
    private float salario;

    public Motorista(String nome){
        super(nome);
    }

    public void getSalario() {
        System.out.println(salario);
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
public class AtividadeTres {
    public static void main (String [] args) {
        Motorista roger = new Motorista("Roger");
        roger.setSalario(100);
        roger.getSalario();
        roger.getNome();
    }
}