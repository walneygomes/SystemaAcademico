import java.util.Scanner;

public class AppMain {
	public static void main(String[] argumentos) throws InterruptedException{
	// CADASTRANDO AS PESSOAS
			Aluno al=new Aluno();
			al.setNome("Charlet");
			Direcao direcao= new Direcao();
			direcao.cadastrarAluno(al);
			direcao.cadastrarAluno(al);
			direcao.cadastrarAluno(al);
			direcao.cadastrarAluno(al);
			direcao.cadastrarAluno(al);
			
			
			
	//  MENU DO SISTEMA
			// DEVE ESCOLHER A OPCAO A OU P, PARA ENTRAR NO PORTAL ALUNO OU PROFESSOR
			    
		System1 sistema= new AlunoSystem();
		Pessoa pessoa=null;
		 Scanner teclado = new Scanner(System.in);
		    System.out.println("++++++++++PPPPPPPPPP++++++++");
		    System.out.println("++++++++++PPPPPPPPPP+++++++++++++++++++");
		    System.out.println("++++++++++PPPPPPPPPP+++++++++++++++++++");
		    System.out.println("++++++++++PPPPPPPPPP+++++++++++++++++++");

do{
		 System.out.println("VOCE É :");
		    System.out.println("ALUNO? DIGITE a:");
		    System.out.println("Professor? DIGITE p:");
		    System.out.println("DIGITE QUALQUER COISA CASO DUVIDA");
		    System.out.println("++++++++++++++++++++++++++++++++++++++");
		    System.out.println("++++++++++++++++++++++++++++++++++++++");

		    String nome = teclado.nextLine();
		   if(!(nome.equals("a")|| nome.equals("p"))){ // CASO CONTRARIO DEVE SE COLOCAR UMA LISTA INTEIRA
			   System.out.println("TA COM INCERTEZA");
			   System.out.println("AQUI ESTA A LISTA DE ALUNOS");
		        direcao.imprimirLista();
		        Thread t= new Thread();
		        t.join();
		   }else{
		    pessoa=sistema.criarPortal(nome);}
		    System.out.print(pessoa);}while(true);		  
		    
		    
		    

	}

}
