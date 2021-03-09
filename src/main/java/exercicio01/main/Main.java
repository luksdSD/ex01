package exercicio01.main;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		int idade = 15;
		
		System.out.println("A idade é de "+ idade +" anos");
		
		idade = (idade+5)*2;
		System.out.println("A idade é de "+ idade +" anos");
		
		idade -= 5;
		System.out.println("A idade é de "+ idade +" anos");
		
		if (idade > 20) {
			System.out.println("maior q 20");
			
		}else {
			System.out.println("menor q 20");
		}
	}
}
