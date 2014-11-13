package ponto.domain;

import ponto.bancoDeDados.BancoDeDados;
import ponto.dao.PessoaDao;
import ponto.model.Pessoa;

import java.util.List;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class PessoaBussines {

    public void salvar(Pessoa nova) {
        if (valida(nova)) {
            //salvar
            PessoaDao dao = new PessoaDao();
            dao.persist(nova);

        }

    }

    private boolean valida(Pessoa obj) {


        if (obj == null) {
            System.out.println(" a pessoa é nula");
            return false;
        }

        if (obj.getNome() == null) {
            System.out.println(" o nome da  pessoa é nulo");
            return false;
        }

        if (obj.getNome().isEmpty()) {
            System.out.println(" o está vazio");
            return false;
        }

        return true;

    }

    public void listarTudo() {

        List<Pessoa> pessoas = BancoDeDados.pessoas;

        for( int i = 0  ; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }


    }

    public Pessoa procuraDados(String chave) {
        PessoaDao dao = new PessoaDao();
        return dao.search(chave);
    }
}
