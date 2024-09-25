package builder.funcionalidades;

public class Motor {
	
	private final double volume;
    private double kilometragem;
    private boolean ligado;

    public Motor(double volume, double kilometragem) {
        this.volume = volume;
        this.kilometragem = kilometragem;
    }

    public void on() {
    	ligado = true;
    }

    public void off() {
    	ligado = false;
    }

    public boolean estaLigado() {
        return ligado;
    }

    public void ligar(double kilometragem) {
        if (ligado) {
            this.kilometragem += kilometragem;
        } else {
            System.err.println("Não é possível prosseguir, é preciso ligar o motor!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getKilometragem() {
        return kilometragem;
    }

}
