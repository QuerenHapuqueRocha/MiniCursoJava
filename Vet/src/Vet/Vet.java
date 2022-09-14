package Vet;

public class Vet {
    public static void main(String[] args) {
 /*       int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        //array
        int [] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
        String[] letras = {"A", "B", "C", "M", "X"};
        for (int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

*/
        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media = media + numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/ numeros.length);
            }
}
