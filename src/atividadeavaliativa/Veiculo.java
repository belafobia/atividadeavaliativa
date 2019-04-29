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
	
	// Fun��o para verificar disponibilidade de ve�culo
	public void dispovei(int id) {
		if (this.isStatus()) {
			System.out.println(this.getNome() + " est� dispon�vel!");
		}else {
			System.out.println(this.getNome() + " N�o est� dispon�vel!");
			
		}
			
	}
	//Fun��o para comparar se ve�culos s�o iguais
	public void comparar(Veiculo v1, Veiculo v2){
		if (v1 == v2){
			System.out.println(v1.getNome() + " e " + this.getNome() + " S�o iguais!!");

		} else {
			System.out.println(v1.getNome() + " e "+ this.getNome() + " N�o s�o iguais");
		}
			
		
	}
	//Fun��o parar verificar se ve�culos s�o da mesma marca
	public void compararmarca(Veiculo v1) {
		if (v1.getMarca().equals(this.getMarca())){
			System.out.println(v1.getNome() + " e " + this.getNome() + " s�o marcas iguais!!");

		} else {
			System.out.println(v1.getMarca() + " e "+ this.getMarca() + " n�o s�o marcas iguais");
		}
	
	}
	// Fun��o para verificar se placas s�o iguais
	public void compararplaca(Veiculo v1){
		if (v1.getPlaca().equals(this.getPlaca())){
			System.out.println(v1.getNome() + " e " + this.getNome() + " tem placas iguais!!");

		} else {
			System.out.println(v1.getNome() + " e "+ this.getNome() + " n�o tem placas iguais");
		}
	}
	// Fun��o para ver qual ve�culo � mais antigo
	public void compararano(Veiculo v1) {
		if (v1.getAno() < (this.getAno())) {
			System.out.println(this.getNome() + " � o carro mais velho" );
			
		} else {
			System.out.println(v1.getNome()+ " � o carro mais velho");	
		}
	}
}
