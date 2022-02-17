package jogadores;

import armas.TipoArma;
import defesas.TipoDefesa;
import remedios.TipoRemedio;

public abstract class Personagem {

	private String nomePersonagem;
	private TipoArma tipoArma;
	private TipoDefesa tipoDefesa;
	private TipoRemedio tipoRemedio;
	
	
	public Personagem(String nomePersonagem, TipoArma tipoArma, TipoDefesa tipoDefesa, TipoRemedio tipoRemedio) {
		super();
		this.nomePersonagem = nomePersonagem;
		this.tipoArma = tipoArma;
		this.tipoDefesa = tipoDefesa;
		this.tipoRemedio = tipoRemedio;
	}
	
	public Personagem() {
		
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public TipoArma getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	public TipoDefesa getTipoDefesa() {
		return tipoDefesa;
	}

	public void setTipoDefesa(TipoDefesa tipoDefesa) {
		this.tipoDefesa = tipoDefesa;
	}

	public TipoRemedio getTipoRemedio() {
		return tipoRemedio;
	}

	public void setTipoRemedio(TipoRemedio tipoRemedio) {
		this.tipoRemedio = tipoRemedio;
	}
	
	
}
