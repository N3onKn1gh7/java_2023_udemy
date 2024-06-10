import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); /* recebe um valor do usuario na variavel x*/

		int soma = 0; 

		while (x != 0) {      /*Enquanto x for diferente de 0 as instruçoes do bloco vao se repetir*/

			soma = soma + x;  /* A variavel soma vai acumular o valor de x*/
			x = sc.nextInt(); /* A variavel soma vai receber o valor de x enquanto x for diferente de 0*/
		}

		System.out.println(soma); /*Quando x for igual a zero, a estrutura repetitiva para e o comando de impressao na tela é realizado mostrando a soma dos falores acumulados*/

		sc.close();

	}

}
