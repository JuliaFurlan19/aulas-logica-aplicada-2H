public class Pessoa {

    // Atributos
    public String nome;
    public String sobrenome;

    // Métodos da classe
    public void falar(){
        System.out.println("Falei");
    }
    public String falar(String texto){
        return texto;
    }

    public Pessoa criarPessoa(){
        return new Pessoa();
    }
}
