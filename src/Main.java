public class Main {
    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){
            System.out.println("Contador = " + contador);

            // Incremento
            contador++;
        }

        // Laço para faça
        for(int x = 0; x < 10; x++){
            System.out.println("Contador = " + x);
        }

        // Laço faça enquanto
        int cont = 1;
        do{
            // Processo
            System.out.println(cont);

            // Incremento
            cont++;

        }while(cont <= 10);

        // Aula introdutória de Orientação a objeto

        // Declaração de Objeto
        Pessoa adao;

        // Instanciação do objeto
        adao = new Pessoa();

        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();

        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";

        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("Oi"));

        // Criar novos objetos

        // Declarar o objeto
        Pessoa rainha;

        // Instanciar objetos
        rainha = new Pessoa();

        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";

        // Definir comportamento
        rainha.falar();
        rainha.comer();
    }
}