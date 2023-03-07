package EstruturaDeRepeticao;

public class Ex04_PopulacaoDoisPaises {

//Supondo que a população de um país A seja da ordem de 80,000 habitantes com uma taxa anual de crescimento de 3%
// e que a população de B seja 200,000 habitantes com uma taxa de crescimento de 1.5%.
//Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

    public static void main(String[] args) {

        int anosASuperarOuIgualarB = 0;
        int paisA = 80000;
        int paisB  = 200000;

        while (paisA < paisB){
            paisA *= 1.03;
            paisB *= 1.015;

            anosASuperarOuIgualarB++;
        }

        System.out.println("Em " + anosASuperarOuIgualarB + " anos, estas serão as populações dos países A e B:");
        System.out.println("País A: " + paisA + " habitantes");
        System.out.println("País B: " + paisB + " habitantes");

    }
}
