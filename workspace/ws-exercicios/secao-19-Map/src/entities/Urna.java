package entities;

import java.util.Objects;

public class Urna {

	private String candidato;
	private Integer votos;

	public Urna() {

	}

	public Urna(String candidato, Integer votos) {
		super();
		this.candidato = candidato;
		this.votos = votos;
	}

	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidato, votos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Urna other = (Urna) obj;
		return Objects.equals(candidato, other.candidato) && Objects.equals(votos, other.votos);
	}

}
