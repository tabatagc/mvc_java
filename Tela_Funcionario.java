package castecnologia;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;


public class Tela_Funcionario {
	
	private Scanner s1;

	public void mensagem (int cod){
		switch(cod)
		{
		case (0):
			System.out.println("Funcionário cadastrado com sucesso!");
		
		case (-1):
			System.out.println("Funcionário não cadastrado");
		
		}
		
	}
	
	public void cadastrar(){
		
		int retorno;
		
		Funcionario fun = new Funcionario();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Digite o nome do novo funcionário da CAS Tecnologia: ");
		fun.Nome = s1.next();
		System.out.println("Digite a Matrícula: ");
		fun.Matricula = s1.next();		
		System.out.println("Digite o Telefone: ");
		fun.Telefone = s1.next();		
		System.out.println("Digite a idade: ");
		fun.Idade = s1.nextInt();
		
		RN_Funcionario objRNFun = new RN_Funcionario();
		retorno = objRNFun.verificaIdadeMinima(fun);
		mensagem(retorno);
		
	}
	
	public void listar(){
		
		List<Funcionario> listaFuncionarios;
		RN_Funcionario objRNFun =new RN_Funcionario();
		
		listaFuncionarios = objRNFun.listaFun();
		
		for(Iterator iterator = listaFuncionarios.iterator(); iterator.hasNext();)
		{
			
			Funcionario fun = (Funcionario) iterator.next();
			System.out.println(fun.Nome);
	
		
		
		}
		
		
		
	}

}
