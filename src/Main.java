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
    }
}