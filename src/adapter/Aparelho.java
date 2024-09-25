package adapter;

public class Aparelho {

	public static void main(String[] args) {
		// Cria uma tomada brasileira
        TomadaBrasileira tomadaBrasileira = new TomadaBrasileira();
        
        // Usa um adaptador para conectá-la como se fosse uma tomada americana
        TomadaAmericana adaptador = new AdaptadorTomada(tomadaBrasileira);
        
        System.out.println("Saída:");
        // Conecta usando o adaptador
        adaptador.conectar(); // Saída esperada: "Conectado na tomada brasileira."
	}

}
