package inputs;

import java.util.Locale;
import java.util.Scanner;
import app.application;

public class Code {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		application app = new application();

		System.out.print("Insira o numero da conta bancária: ");
		app.setId(sc.nextInt());
		System.out.print("Insira o nome do usuário: ");
		app.setName(sc.next());
		
		System.out.print("Deseja realizar um depósito inicial?(s/n)?");
		app.resp = sc.next().charAt(0);
		if(app.resp != 'n') {
			System.out.print("Insira o valor a ser depositado: $");
			app.setDeposit(sc.nextDouble());
			System.out.printf("Olá " + app.getName() + ", o seu ID é: " + app.getId() + " e seu saldo bancário é de: $ %.2f", app.getTotalDeposit());
			System.out.println();
			}else{
				app.setDeposit(0);
				System.out.printf("Olá " + app.getName() + ", o seu ID é: " + app.getId() + " e seu saldo bancário é de: $ %.2f", app.getTotalDeposit());
				System.out.println();
			}
				
					System.out.print("Deseja Adicionar mais dinheiro em sua conta?(s/n)?");
					app.resp = sc.next().charAt(0);
					if(app.resp != 'n') {
					System.out.print("Insira a quantidade a ser depositada na conta: $");
					app.setAccDeposit(sc.nextDouble());
					System.out.printf("Olá " + app.getName() + ", o seu ID é: " + app.getId() + " e seu saldo bancário é de: $ %.2f", app.getTotalDeposit());
					System.out.println();
					}else{
						System.out.println("Tudo bem, até a proxima!");
					}
						System.out.print("Deseja sacar dinheiro em sua conta?(s/n)?");
						app.resp = sc.next().charAt(0);
						if(app.resp != 'n') {
						app.setWithdraw(sc.nextDouble());
							System.out.printf("Olá " + app.getName() + ", o seu ID é: " + app.getId() + " e seu saldo bancário é de: $ %.2f", app.getTotalWithdraw());
							}else{
							System.out.println("Tudo bem, até a proxima!");
							}

		sc.close();
	
			
}
}