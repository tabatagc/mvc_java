package castecnologia;

import java.util.Scanner;



public class AplicacaoCas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("Menu Principal - Cas Tecnologia");
		System.out.println("1 - Cadastro do Funcionário");
		System.out.println("2 - Listagem dos Funcionários");
		System.out.println("3 - Sair do Programa");
		op = s.nextInt();	
		
		Tela_Funcionario objTelaFunc = new Tela_Funcionario();
		
		switch(op){
		case (1):
			objTelaFunc.cadastrar();
		break;
		
		case (2):
			objTelaFunc.listar();
		break;
		case (3):
			System.out.println("Obrigada, volte sempre!");
		break;
		default:
			System.out.print("Opção inválida, por favor escolha outra opção!");
		break;
		
		}
		}while(op !=3);
		
	}
	
			
		

		

		


}
