package br.fai.projeto05;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		System.out.println("Enviando essa branch para o github");
		usandoFor();
		
		}
	
	private void usandoFor() {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 1: System.out.println("Primeira condi��o");
			break;
			
			case 4: System.out.println("Segunda condi��o");
			break;
			
			default:
				System.out.println("N�o encontrou nenhuma condi��o");
				break;
			}
	}
	
		
	}
	

}
