package builder.construtores;

import builder.funcionalidades.ComputadorDeBordo;
import builder.funcionalidades.GPS;
import builder.funcionalidades.Modelo;
import builder.funcionalidades.Motor;
import builder.funcionalidades.Transmissao;
import builder.produtos.Manual;

public class ManualBuilder implements Builder {

	private Modelo modelo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private GPS gps;
    
	@Override
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;		
	}

	@Override
	public void setAssentos(int assentos) {
		this.assentos = assentos;		
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;		
	}

	@Override
	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;		
	}

	@Override
	public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
		this.computadorDeBordo = computadorDeBordo;		
	}

	@Override
	public void setGPS(GPS gps) {
		this.gps = gps;		
	}
	
	public Manual build() {
        return new Manual(modelo, assentos, motor, transmissao, computadorDeBordo, gps);
    }

}
