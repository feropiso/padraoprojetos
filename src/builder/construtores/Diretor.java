package builder.construtores;

import builder.funcionalidades.ComputadorDeBordo;
import builder.funcionalidades.GPS;
import builder.funcionalidades.Modelo;
import builder.funcionalidades.Motor;
import builder.funcionalidades.Transmissao;

public class Diretor {
	
	 public void construirModeloEsportivo(Builder builder) {
		 builder.setModelo(Modelo.SPORTS_CAR);
		 builder.setAssentos(2);
		 builder.setMotor(new Motor(3.0, 0));
		 builder.setTransmissao(Transmissao.SEMI_AUTOMATIC);
		 builder.setComputadorDeBordo(new ComputadorDeBordo());
		 builder.setGPS(new GPS());
	 }
	 
	 public void construirModeloUrbano(Builder builder) {
		 builder.setModelo(Modelo.CITY_CAR);
		 builder.setAssentos(2);
		 builder.setMotor(new Motor(1.2, 0));
		 builder.setTransmissao(Transmissao.AUTOMATIC);
		 builder.setComputadorDeBordo(new ComputadorDeBordo());
		 builder.setGPS(new GPS());
	 }
	 
	 public void construirModeloSUV(Builder builder) {
		 builder.setModelo(Modelo.SUV);
		 builder.setAssentos(4);
		 builder.setMotor(new Motor(2.5, 0));
		 builder.setTransmissao(Transmissao.MANUAL);		
		 builder.setGPS(new GPS());
	 }

}
