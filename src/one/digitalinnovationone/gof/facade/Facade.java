package one.digitalinnovationone.gof.facade;

import one.digitalinnovationone.gof.subsistema1.crm.CrmService;
import one.digitalinnovationone.gof.subsistema2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado =CepAPI.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
