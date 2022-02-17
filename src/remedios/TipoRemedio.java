package remedios;

public enum TipoRemedio {

	GOTAS_DA_SABEDORIA ("++ Gotas da sabedoria ++"),
	COMPRIMIDO_DA_CORAGEM ("++ Comprimido da coragem ++"),
	FOLHA_ANTIMEDO ("++ Folha antimedo ++"),
	SPRAY_REVIGORANTE ("++ Spray revigorante ++");
	
	private final String remedio;
	
	TipoRemedio(String remedio) {
		this.remedio = remedio;
	}

	public String getArmas() {
		return remedio;
	}
	
}
