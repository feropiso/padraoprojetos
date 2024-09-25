package builder.funcionalidades;

public class GPS {
	
	private String rota;

    public GPS() {
        this.rota = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPS(String manualrota) {
        this.rota = manualrota;
    }

    public String getRoute() {
        return rota;
    }

}
