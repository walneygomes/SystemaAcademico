
public  abstract class System1 {
	private static final int QNT_MAX_ALUNOS=100;
	static Aluno[] listaAlunosMatriculados=new Aluno[QNT_MAX_ALUNOS];
	public Pessoa criarPortal(String pessoa){
		Pessoa pesso=null;
		pesso= abrirPortal(pessoa);
		
		return pesso;
		
		
	}
	public abstract Pessoa abrirPortal(String pessoa);
	

}
