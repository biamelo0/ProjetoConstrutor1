package ProjetoConstrutor;

import ProjetoConstrutor.Cliente.Cliente;
import ProjetoConstrutor.Cliente.Cliente2;
import ProjetoConstrutor.Endereco.Endereco;
import ProjetoConstrutor.Endereco.Endereco2;
import ProjetoConstrutor.ItemTema.ItemTema;
import ProjetoConstrutor.ItemTema.ItemTema2;
import ProjetoConstrutor.Tema.Tema;
import ProjetoConstrutor.Tema.Tema2;

public class Principal {
public static void main (String [] args) {
		
		Tema2 tema1 = new Tema2();
		tema1.setCorToalha(22);
		tema1.setId(222);
		tema1.setNome("Beatriz");
		tema1.setValorAluguel(222);
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		

		Tema tema2 = new Tema(12, "Pascoa",2354455,2544);
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());
		
		
		ItemTema2 Itemtema1 = new ItemTema2();
		Itemtema1.setId(222);
		Itemtema1.setNome("Beatriz");
		Itemtema1.setDescricao(222);
		System.out.println(Itemtema1.getId());
		System.out.println(Itemtema1.getNome());
		System.out.println(Itemtema1.getDescricao());
		
		
		ItemTema Itemtema2 = new ItemTema(12, "Pascoa",2354455,2544);
		System.out.println(Itemtema1.getId());
		System.out.println(Itemtema1.getNome());
		System.out.println(Itemtema1.getDescricao());
		
		System.out.println(Itemtema2.getId());
		System.out.println(Itemtema2.getNome());
		System.out.println(Itemtema2.getDescricao());
		
		
		Endereco2 Endereco1 = new Endereco2(23,"787",82,"888","*8990","88997","uoh","hnho", "89202");
		System.out.println(Endereco1.getId());
		System.out.println(Endereco1.getLogradouro());
		System.out.println(Endereco1.getNumero());
		System.out.println(Endereco1.getComplemento());
		System.out.println(Endereco1.getBairro());
		System.out.println(Endereco1.getCidade());
		System.out.println(Endereco1.getCep());
		System.out.println(Endereco1.getUf());
		
		Endereco Endereco12 = new Endereco();
		Endereco12.setBairro("aaa");
		Endereco12.setId(45);
		Endereco12.setLogradouro("aaa");
		Endereco12.setNumero(44);
		Endereco12.setComplemento("aaa");
		Endereco12.setCidade("aaa");
		Endereco12.setCep("aaa");
		Endereco12.setUf("aaa");
		System.out.println(Endereco12.getId());
		System.out.println(Endereco12.getLogradouro());
		System.out.println(Endereco12.getNumero());
		System.out.println(Endereco12.getComplemento());
		System.out.println(Endereco12.getBairro());
		System.out.println(Endereco12.getCidade());
		System.out.println(Endereco12.getCep());
		System.out.println(Endereco12.getUf());
		
		
		Cliente2 cliente1 = new Cliente2();
		
		cliente1.setId(22);
		cliente1.setNome("Beatriz");
		cliente1.setTelefone("99394994");
		cliente1.setCpf("93839344");
		cliente1.setRg("389248");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		

		Cliente cliente2 = new Cliente(12, "Julio","2354455","2544","842795");

		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		
	}


}
