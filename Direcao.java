
public class Direcao extends Pessoa {

	static int  pos;
	
	public void cadastrarAluno(Aluno aluno){
		AlunoSystem sy= new AlunoSystem();
		sy.cadastrarAluno(aluno);
	}
	public void imprimirLista(){
		AlunoSystem sy= new AlunoSystem();
        sy.imprimirListaAlunos();
	}
	
	

}
