package EstruturaDeRepeticao;

public class Ex12_2_MetodoTabuada {

    static void imprimirTabuada(int numero){

        for (int i=1; i<= 10; i++){
            System.out.printf("%d * %d = %d", numero, i, numero*i).println();
        }

    }

    public static void main(String[] args) {
        imprimirTabuada(2);
    }
}
