package builder.produtos;

import builder.funcionalidades.ComputadorDeBordo;
import builder.funcionalidades.GPS;
import builder.funcionalidades.Modelo;
import builder.funcionalidades.Motor;
import builder.funcionalidades.Transmissao;

public class Manual {

	private final Modelo modelo;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;
	private final ComputadorDeBordo computadorDeBordo;
	private final GPS gps;

	public Manual(Modelo modelo, int assentos, Motor motor, Transmissao transmissao,
			ComputadorDeBordo computadorDeBordo, GPS gps) {
		this.modelo = modelo;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		this.computadorDeBordo = computadorDeBordo;
		this.gps = gps;
	}

	public String print() {
		
		String info = "";
		info += "Modelo do carro: " + modelo + "\n";
		info += "Número de assentos: " + assentos + "\n";
		info += "Motor: volume - " + motor.getVolume() + "; Kilometragem - " + motor.getKilometragem() + "\n";
		info += "Transmissão: " + transmissao + "\n";
		if (this.computadorDeBordo != null) {
			info += "Computador de bordo: Functional" + "\n";
		} else {
			info += "Computador de bordo: N/A" + "\n";
		}
		if (this.gps != null) {
			info += "GPS Navigator: Functional" + "\n";
		} else {
			info += "GPS Navigator: N/A" + "\n";
		}
		return info;
	}

}
