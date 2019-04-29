package atividadeavaliativa;

public class Main {

	//Criando o primeiro veiculo
	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.setAno(2008);
		v.setMarca("Ford");
		v.setNome("FordK");
		v.setPlaca("HHS-6353");
		v.setCode(237);
		v.setStatus(false);
		System.out.println(v.getAno());
		v.dispovei(237);
		
		//criando o segundo veiculo
		Veiculo v1 = new Veiculo();
		v1.setAno(2012);
		v1.setMarca("Volkswagen");
		v1.setNome("Gol");
		v1.setPlaca("HTS-6802");
		v1.setCode(341);
		v1.setStatus(true);
		System.out.println(v1.getAno());
		v1.dispovei(341);
		
		//checando comparações
		v.comparar(v, v1);
		v.compararmarca(v1);
		v.compararplaca(v1);
		v.compararano(v1);
		
		//criando o terceiro veiculo
		Veiculo v2 = new Veiculo();
		v2.setAno(2018);
		v2.setMarca("Fiat");
		v2.setNome("Punto");
		v2.setPlaca("KDO-8274");
		v2.setCode(033);
		v2.setStatus(false);
		System.out.println(v2.getAno());
		v2.dispovei(033);
		
		//criando dono do carro
		Cliente p = new Cliente();
		p.setCnh(716873286);
		p.setIdade(27);
		p.setNome("Roger");
		p.setV(v2);
		System.out.println(p.getNome() + " possui o veículo " + p.getV().getNome());
		
		
	}

}
