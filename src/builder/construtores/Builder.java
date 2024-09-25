package builder.construtores;

import builder.funcionalidades.ComputadorDeBordo;
import builder.funcionalidades.GPS;
import builder.funcionalidades.Modelo;
import builder.funcionalidades.Motor;
import builder.funcionalidades.Transmissao;

public interface Builder {
	void setModelo(Modelo modelo);
	void setAssentos(int assentos);
	void setMotor(Motor motor);
	void setTransmissao(Transmissao transmissao);
	void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
	void setGPS(GPS gps);

}
