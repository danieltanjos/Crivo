public class Crivo {
	public static void main(String[] args) {

		int[] valores = new int[100];
		int tamanho = valores.length;
		
		for(int i = 0; i < tamanho; i++) {
			valores[i] = i + 1;
		}
		
		System.out.println("Valores primos dentro do intervalo:");

		int acum = 0;

		for(int i = 0; i < tamanho; i++) {
			for(int j = valores[i]; j != 0; j--) {
				if((valores[i] % valores[j]) == 0) {
					acum++;
				}
			}

		if(acum >= 2) {
			System.out.println(valores[i]);
			acum = 0;
			}
		}
	}
}