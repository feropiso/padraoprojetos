package builder;

import builder.construtores.CarroBuilder;
import builder.construtores.Diretor;
import builder.construtores.ManualBuilder;
import builder.produtos.Carro;
import builder.produtos.Manual;

public class Demo {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		
		CarroBuilder builder = new CarroBuilder();
		diretor.construirModeloEsportivo(builder);
		
		Carro carro = builder.build();
		System.out.println("Carro construído:\n" + carro.getModelo());
		
		ManualBuilder manualBuilder = new ManualBuilder();
		diretor.construirModeloEsportivo(manualBuilder);
		
		Manual manual = manualBuilder.build();
		System.out.println("\nEspecificações:\n" + manual.print());

	}

}
