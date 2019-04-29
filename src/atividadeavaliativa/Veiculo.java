package atividadeavaliativa;

public class Veiculo {
	private String nome;
	private String marca;
	private String placa;
	private int ano;
	private int code;
	private boolean status = true;
	
	
	public int getAno() {
		return ano;
	}
	public String getMarca() {
		return marca;
	}
	public String getNome() {
		return nome;
	}
	public String getPlaca() {
		return placa;
	}
	public int getCode() {
		return code;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	// Função para verificar disponibilidade de veículo
	public void dispovei(int id) {
		if (this.isStatus()) {
			System.out.println(this.getNome() + " está disponível!");
		}else {
			System.out.println(this.getNome() + " Não está disponível!");
			
		}
			
	}
	//Função para comparar se veículos são iguais
	public void comparar(Veiculo v1, Veiculo v2){
		if (v1 == v2){
			System.out.println(v1.getNome() + " e " + this.getNome() + " São iguais!!");

		} else {
			System.out.println(v1.getNome() + " e "+ this.getNome() + " Não são iguais");
		}
			
		
	}
	//Função parar verificar se veículos são da mesma marca
	public void compararmarca(Veiculo v1) {
		if (v1.getMarca().equals(this.getMarca())){
			System.out.println(v1.getNome() + " e " + this.getNome() + " são marcas iguais!!");

		} else {
			System.out.println(v1.getMarca() + " e "+ this.getMarca() + " não são marcas iguais");
		}
	
	}
	// Função para verificar se placas são iguais
	public void compararplaca(Veiculo v1){
		if (v1.getPlaca().equals(this.getPlaca())){
			System.out.println(v1.getNome() + " e " + this.getNome() + " tem placas iguais!!");

		} else {
			System.out.println(v1.getNome() + " e "+ this.getNome() + " não tem placas iguais");
		}
	}
	// Função para ver qual veículo é mais antigo
	public void compararano(Veiculo v1) {
		if (v1.getAno() < (this.getAno())) {
			System.out.println(this.getNome() + " é o carro mais velho" );
			
		} else {
			System.out.println(v1.getNome()+ " é o carro mais velho");	
		}
	}
}
