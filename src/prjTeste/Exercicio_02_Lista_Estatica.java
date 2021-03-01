package prjTeste;


public class Exercicio_02_Lista_Estatica {
	
	private char dados[];
	private int tamanho;
	
	public Exercicio_02_Lista_Estatica() {
		dados = new char[4];
	}
	
	public void AdicionaFinal (char x){
		if (tamanho < dados.length) {
			dados[tamanho] = x;
			tamanho++;
		} 
	}	
	
	public void AdicionaInicio(char x) {
		if(tamanho < dados.length) {
			for(int i = tamanho; i>0; i--) {
				dados[i] = dados [i - 1];
			}
			dados[0] = x;
			tamanho++; 
		} else {
			System.out.println("Erro, Lista Cheia!");
		}
	}
	
	public void AdicionaQualquerPosicao(char x, int pos) {
		int i;
		if((tamanho < dados.length) && (pos <tamanho+1) && (pos>=0)){
			for( i = tamanho; i != pos; i --) {
				if (i!=0) {
					dados[i] = dados[i-1];
				}
			}
			dados[i] = x;
			tamanho++; 
		} else {
			System.out.println("Error!!!");
		}			
	}
	
	public char RemoveFinal() {
		char retorno = 0;
		int i;
		if( tamanho >= 1) {
			 retorno = dados[tamanho-1];
			 for(i=0; i<tamanho; i++) {
				 if(i == tamanho - 1) {
					 tamanho--;
				 }
			 }
		 }
		return retorno;
	}
	
	public char RemoveInicio() {
		char retorno = 0;
		int i;
		if( tamanho >= 1) {
			 retorno = dados[0];
			 for(i=1; i<tamanho; i++) {
				dados[i-1] = dados[i];
			 }
			 tamanho--;
		 }
		return retorno;
	}
	
	public char RemoveQualquerPosicao(int pos) {
		int i;
		char retorno = 0;
		
		if((pos < tamanho)  && (pos>=0) && (tamanho >=1)){
			retorno = dados[pos];
			
			for (i = pos; i < tamanho-1; i ++) {
				dados[i] = dados[i + 1];
			}
			tamanho--; 
		} else {
			System.out.println("Error");
		}		
		return retorno;
	}
	
	public String Percorre() {
		String aux = " ";
		
		for (int i = 0; i<tamanho; i++) {
			aux = aux + "\n" + dados[i];
		}
		return aux;
	}
	
	public boolean Vazio() {
		if( tamanho == 0){
			return true;
		}
		return false;
	}
	
	public boolean Cheio() {
		if( tamanho == dados.length){
			return true;
		}
		return false;
	}
	
}





























