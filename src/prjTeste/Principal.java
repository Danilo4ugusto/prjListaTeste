package prjTeste;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int opc = 0 ;
		char caractere; 
		int pos;
		
		Exercicio_02_Lista_Estatica lista = new Exercicio_02_Lista_Estatica();
		
		while (opc!=10){
			
			opc = Integer.parseInt(JOptionPane.showInputDialog ("Lista: \n\n01 - Adicionar no Início. \n02 - Adicionar no Final. \n03 - Adicionar em qualquer posição. \n04 - Remover do Início. \n05 - Remover do Final. \n06 - Remover em qualquer posição.\n07 - Verificar se a lista está vazia: \n08 - Verificar se a lista está cheia: \n09 - Exibir Lista. \n10 - Finalizar. \n "));
			switch (opc) {
			
			case 1: 		
				if ( lista.Cheio() == false) {
				caractere = JOptionPane.showInputDialog("Insira um caractere: ").charAt(0);
				lista.AdicionaInicio((char) caractere);	
				} else {
					JOptionPane.showMessageDialog(null, "Lista Cheia!");
				}
			break;
			
			case 2: 
				if ( lista.Cheio() == false) {
					caractere = JOptionPane.showInputDialog("Insira um caractere: ").charAt(0);
					lista.AdicionaFinal((char) caractere);	
					} else {
						JOptionPane.showMessageDialog(null, "Lista Cheia!");
					}			
			break;
			
			case 3: 
				if ( lista.Cheio() == false) {
					caractere = JOptionPane.showInputDialog("Insira um caractere: ").charAt(0);
					pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que será incluído o caractere: "));
					pos=pos-1;     
					lista.AdicionaQualquerPosicao((char) caractere, pos);
				} else {
					JOptionPane.showMessageDialog(null, "Lista Cheia!");
				}
			break;
		
			case 4:
				if ( lista.Vazio() == true) {
					JOptionPane.showMessageDialog(null,"Espaço Vazio");
				}else {
					JOptionPane.showMessageDialog(null,"O caractere removido foi: "+ lista.RemoveInicio());
				}				
			break;
				
			case 5:
				if ( lista.Vazio() == true) {
					JOptionPane.showMessageDialog(null,"Espaço vazio");
				}else {
					JOptionPane.showMessageDialog(null,"O caractere removido foi: "+ lista.RemoveFinal());
				}				
			break;
			
			case 6:
				if ( lista.Vazio() == true) {
					JOptionPane.showMessageDialog(null,"Espaço Vazio");
				}else {
					pos= Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que será excluído o caractere:"));
					pos= pos-1;  				
					JOptionPane.showMessageDialog(null,"O elemento removido foi: " + lista.RemoveQualquerPosicao(pos));
				}
			break;
			
			case 7:
				JOptionPane.showMessageDialog(null,"A lista encontrasse vazia? "+ lista.Vazio());       
			break;
			
			case 8:
				JOptionPane.showMessageDialog(null,"A lista encontrasse cheia? "+ lista.Cheio());       
			break;
			
			case 9:
				if ( lista.Vazio() == true) {
					JOptionPane.showMessageDialog(null,"Lista Vazia");
				}else {
					JOptionPane.showMessageDialog(null,"Lista: "+ lista.Percorre());  
				}
			break;			
			
			case 10:
				JOptionPane.showMessageDialog(null,"Programa finalizado!");
			break;
			
			default: 
				JOptionPane.showMessageDialog(null,"Opção Inválida");
			}
		}
	}
}

