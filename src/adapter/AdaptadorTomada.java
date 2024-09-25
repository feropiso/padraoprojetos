package adapter;

public class AdaptadorTomada implements TomadaAmericana {
	
	private TomadaBrasileira TomadaBrasileira;
	
	 // Construtor que recebe uma instância de TomadaBrasileira
	public AdaptadorTomada(TomadaBrasileira tomadaBrasileira) {
		TomadaBrasileira = tomadaBrasileira;
	}
	
	 // Método que adapta a interface brasileira para a americana
	@Override
	public void conectar() {
		TomadaBrasileira.conectarNaTomadaBrasileira();		
	}	
	
}
