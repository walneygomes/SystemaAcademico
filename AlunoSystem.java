
public class AlunoSystem extends System1{
	private static final int QNT_MAX_ALUNOS=100;
	static Aluno[] listaAlunosMatriculados=new Aluno[QNT_MAX_ALUNOS];
	static int pos=0;
	public void cadastrarAluno(Aluno aluno){
		listaAlunosMatriculados[pos]=aluno;
		pos++;
	}
	
	public Pessoa abrirPortal(String pessoa){
		Pessoa pesso=null;
		
		if(pessoa.equals("a")){
			pesso= new Aluno();
		}
		return pesso;
		
		
	}
	
	public void imprimirListaAlunos(){
		int cout=0;
		while(cout<pos){
		System.out.print(listaAlunosMatriculados[cout].getNome());
		cout++;
		}
	}

}
