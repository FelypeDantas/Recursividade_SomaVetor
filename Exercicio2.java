package recursivas;


// Usando recursividade, calcule a soma de todos os valores de um array de reais.

public class Exercicio2 {
   public static void main(String args[]) {
	  double vetor[] = { 1.3 , 2.5, 3 , 5.2, 6.1};
	  int n = 5;
	  
	  System.out.println("A soma dos valores desse vetor: " + Soma(vetor, n));
   }

private static double Soma(double[] vetor, int n) {
	if(n == 0) {
		return 0;
	}
	return vetor[n-1] + Soma(vetor, n-1);
}
}
