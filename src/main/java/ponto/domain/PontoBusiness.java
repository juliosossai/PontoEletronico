package ponto.domain;

import ponto.dao.PontoDao;
import ponto.model.Ponto;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class PontoBusiness {

    public void savar(Ponto nova) {
        if (valida(nova)) {
            //salvar
            PontoDao dao = new PontoDao();
            dao.persist(nova);

        }
    }

    private boolean valida(Ponto obj) {

        if (obj == null) {
            System.out.println(" o registro é nula");
            return false;
        }

        if (obj.getData() == null) {
            System.out.println(" o data é nulo");
            return false;
        }

        if (obj.getData().isEmpty()) {
            System.out.println(" está vazio");
            return false;
        }

        return true;

    }

    public void listarTudo() {

    }

    public Ponto procuraDados(String chave) {

    }

}
