
public class CalculoMedia {

	public static void main(String[] args) {
	
		int vetor[] = {2,2,1};
		
		
		double media = media(vetor);
		System.out.println("A média é: " + media);
	}
	
	public static double media(int vetor[]){
		int contador = 0;
		double total = 0;
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
			contador++;
		}
		
		media = (total/contador);
		
		return media;
	}

}
