package entities;

public class Quartos {
	private String nome;
	private String email;

	public Quartos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public Quartos() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(", ");
		sb.append(getEmail());
		return sb.toString();
	}

}
