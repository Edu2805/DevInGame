package excecoes;


public class ExcecaoEntradaJogador extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ExcecaoEntradaJogador(String error) {
		super(error);
	}
	
	boolean trataSintaxeInt;
	
	public boolean trataEscolhaJogador(int escolhaTratada) {
		
		String valorString = String.valueOf(escolhaTratada);
		
		trataSintaxeInt = valorString != null && valorString.matches("^([1-2]{1})");
		
		
		return trataSintaxeInt;
		
	}
	
}
