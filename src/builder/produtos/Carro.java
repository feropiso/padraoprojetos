package builder.produtos;

import builder.funcionalidades.ComputadorDeBordo;
import builder.funcionalidades.GPS;
import builder.funcionalidades.Modelo;
import builder.funcionalidades.Motor;
import builder.funcionalidades.Transmissao;

public class Carro {
	
	private final Modelo modelo;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorDeBordo computadorDeBordo;
    private final GPS gps;
    private double combustivel = 0;
    
	public Carro(Modelo modelo, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo,
			GPS gps, double combustivel) {
		this.modelo = modelo;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		this.computadorDeBordo = computadorDeBordo;
		if (this.computadorDeBordo != null) {
            this.computadorDeBordo.setCarro(this);
        }
		this.gps = gps;
		this.combustivel = combustivel;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public ComputadorDeBordo getComputadorDeBordo() {
		return computadorDeBordo;
	}

	public GPS getGps() {
		return gps;
	}
    
}
