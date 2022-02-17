package armas;

public enum TipoArma {

	FLECHA_DE_FOGO ("++ Flecha de fogo ++"),
	ESPADA_DE_ESPINHOS ("++ Espada de espinhos ++"),
	CORRENTE_DE_NAJA ("++ Corrente de naja ++"),
	SABRE_ENVENENADO ("++ Sabre envenenado ++");
	
	private final String armas;
	
	TipoArma(String armas) {
		this.armas = armas;
	}

	public String getArmas() {
		return armas;
	}
}
