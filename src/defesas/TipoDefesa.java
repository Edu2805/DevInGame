package defesas;

public enum TipoDefesa {

	ESCUDO_DE_PAU_BRASIL ("++ Escudo de pau Brasil ++"),
	CAPA_INVERTIDA ("++ Capa invertida ++"),
	OCULOS_ACELERADOR ("++ Óculos acelerador ++"),
	PO_PARALISANTE ("++ Pó paralisante ++");
	
	private final String defesa;
	
	TipoDefesa(String defesa) {
		this.defesa = defesa;
	}

	public String getArmas() {
		return defesa;
	}
	
}
