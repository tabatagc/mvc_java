package castecnologia;

import java.util.Scanner;
import java.util.List;

public class RN_Funcionario {


	public int verificaIdadeMinima(Funcionario fun)
	{
		
		int resp = 0;
		
		if(fun.Idade < 18){
			resp = -1;
			
		}else
		{
			DAO_Funcionario objDAOFun = new DAO_Funcionario();
			objDAOFun.gravaFuncionario(fun);
			
		}
		return resp;
		
	}
	
	
	public List<Funcionario> listaFun(){
		
		DAO_Funcionario objDAOFun = new DAO_Funcionario();
		return objDAOFun.listaFuncionario();
		
	}
		
}


