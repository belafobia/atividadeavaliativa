package atividadeavaliativa;
//criando classe de cliente
public class Cliente {

	private String nome;
	private int cnh;
	private int idade;
	private Veiculo v;
	
	public int getCnh() {
		return cnh;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public Veiculo getV() {
		return v;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setV(Veiculo v) {
		this.v = v;
	}
	

}

	
