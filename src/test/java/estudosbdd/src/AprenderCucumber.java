package estudosbdd.src;

import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Calendar;
import java.util.Date;

public class AprenderCucumber {


    @Given("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("executa lo")
    public void executa_lo() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("a especificacao deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
    }

    private int contador = 15;

    @Given("que o valor do contador e {int}")
    public void que_o_valor_do_contador_e(Integer int1) {
        contador = int1;
    }
    @When("quando encrementar {int}")
    public void quando_encrementar(Integer int1) {
        contador += int1;
    }
    @Then("o valor do contador sera {int}")
    public void o_valor_do_contador_sera(Integer int1) {
        System.out.println(contador);
        System.out.println(int1);
        Assert.assertEquals(java.util.Optional.of(contador).get(), int1);
    }

    Date entrega = new Date();
    @Given("dado que a data de entrega é dia {date}")
    public void dado_que_a_data_de_entrega_é_dia(Date data) {

        entrega = data;
        System.out.println(entrega);
    }
    @When("a entrega atrazar em {int} dias")
    public void a_entrega_atrazar_em_dias(Integer dia) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("a entrega sera efetuada em {int}\\/{int}\\/{int}")
    public void a_entrega_sera_efetuada_em(Integer dia, Integer mes, Integer ano) {
        // Write code here that turns the phrase above into concrete actions
    }


}
