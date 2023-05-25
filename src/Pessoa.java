public class Pessoa extends Animal {

    // Atributos
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

    // Sobrescrita do método
    public void comer(){
        System.out.println("Pessoa comeu");
    }
}
