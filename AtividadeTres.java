import java.io.*;

class Pessoa implements Serializable {
    String nome = "andre";
    int idade = 8;
}


public class AtividadeTres {
    public static void main(String[] args){
        Pessoa andre = new Pessoa();
        andre.nome = "andre";
        File caminho = new File("C:/Users/C313/Nova");
        if(caminho.exists())
        {
            System.out.println("caminho existe");
        }
        else{
            System.out.println("tentando criar caminho");
            caminho.mkdirs();
        }
        try{
            File arquivo = new File(caminho,"pessoa.db");
            ObjectOutput objEscrita =  new ObjectOutputStream(new FileOutputStream(arquivo.getAbsoluteFile()));
            objEscrita.writeObject(andre);
            objEscrita.close();
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}
