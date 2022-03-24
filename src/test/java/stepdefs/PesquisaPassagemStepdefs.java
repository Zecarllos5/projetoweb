package stepdefs;

import io.cucumber.java.pt.Dado;
import pages.HomePage;

public class PesquisaPassagemStepdefs {

    @Dado("que digito a cidade")
    public void queDigitoACidade() {
        HomePage homePage = new HomePage("chrome");
        homePage.pesquisar("Recife");
    }
}
