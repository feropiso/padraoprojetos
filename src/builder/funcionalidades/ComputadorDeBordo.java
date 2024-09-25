package builder.funcionalidades;

import builder.produtos.Carro;

public class ComputadorDeBordo {
	
	private Carro carro;

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void mostrarNivelCombustivel() {
        System.out.println("Nível de combustível: " + carro.getCombustivel());
    }

    public void showStatus() {
        if (this.carro.getMotor().estaLigado()) {
            System.out.println("O carro está ligado");
        } else {
            System.out.println("O carro não está ligado");
        }
    }

}
