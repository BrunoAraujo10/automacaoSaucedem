package Steps;

import Elementos.ElementosDaLoja;
import Metodos.MetodosDaLoja;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class TesteLoja {
	
	ElementosDaLoja e = new ElementosDaLoja();
	MetodosDaLoja m = new MetodosDaLoja();
	
	@Dado("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
		m.abrirNavegador(url);
		
	    
	}

	@Quando("^eu clicar  no botao cadastre-se$")
	public void eu_clicar_no_botao_cadastre_se() throws Throwable {
		m.pausar(3000);
		m.preencher(e.getUserName(), "standard_user");
		m.pausar(2000);
		m.preencher(e.getPassword(), "secret_sauce");
		m.pausar(2000);
		m.clicar(e.getBtnLogin());
		m.clicar(e.getBtnAddToCart());
		m.pausar(2000);
		m.clicar(e.getCarrinho());
		m.pausar(2000);
		m.clicar(e.getCheckout());
		m.pausar(2000);
		
	}

	@Quando("^preencher os dados valido$")
	public void preencher_os_dados_valido() throws Throwable {
		m.preencher(e.getFirstName(), "TESTE");
		m.pausar(2000);
		m.preencher(e.getLastName(), "TESTE12345");
		m.pausar(2000);
		m.preencher(e.getCodePostal(), "048564569");
		m.clicar(e.getBtnContinue());
		m.pausar(2000);
		m.clicar(e.getBtnFinish());
		m.pausar(2000);
		m.clicar(e.getMenuLateral());
		m.pausar(2000);
		m.clicar(e.getLogout());
		m.pausar(2000);
		m.fecharNavegador();
		
	    
	}

	@Entao("^sou logado no site$")
	public void sou_logado_no_site() throws Throwable {
	    
	}

}

