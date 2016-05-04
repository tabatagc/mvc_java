package castecnologia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DAO_Funcionario {

	private File arquivo;
	
	public int gravaFuncionario(Funcionario fun){
	
		int resp = 0;
		
		try{
			
			arquivo = new File("arquivoFun.txt");
			//recebe e add ao invés de substituir
			FileWriter fw = new FileWriter(arquivo, true);
			//recebe como argumento o obj do tipo writer
			BufferedWriter bw = new BufferedWriter(fw);
			//escreve no arquivo
			bw.write(fun.Nome + ";" + fun.Matricula + ";" + fun.Idade + ";" + fun.Telefone + ";" + Integer.toString(fun.Idade));
			//quebra linha
			bw.newLine();
			//fecha recurso
			bw.close();
			fw.close();
		
			
			
		}
		catch(Exception e)
		{
			System.out.println("Ocorreu o erro" + e.getMessage());
		}
	
		return resp;
	}
	
	public List<Funcionario> listaFuncionario(){
	
		List<Funcionario> listaFucionario = new ArrayList<Funcionario>();
		Funcionario objFun;
		try{
			arquivo = new File("arquivoFun.txt");
			FileReader fr = new  FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			
			while (br.ready())
			{
				//lê a prox. linha
				String linha = br.readLine();
				objFun = new Funcionario();
				
				
				//Faz algo com a linha
				String campos[] = linha.split(";");
				objFun.Nome = campos[0];
				objFun.Matricula = campos[1];
				objFun.Telefone = campos[2];
				objFun.Idade = Integer.parseInt(campos[3]);
				
				
				listaFucionario.add(objFun);
				
			}
			
			
		}catch(Exception e){
			System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
			
		}
		return listaFucionario;
	} 
	
}
