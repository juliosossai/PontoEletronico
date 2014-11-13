package ponto.dao;

import ponto.bancoDeDados.BancoDeDados;
import ponto.model.Pessoa;


import java.util.List;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class PessoaDao {

    public void persist(Pessoa nova) {
        BancoDeDados.pessoas.add(nova);

    }

    public void update(int index ,Pessoa nova) {
        BancoDeDados.pessoas.set(index, nova);

    }

    public void remove(Pessoa nova) {
        BancoDeDados.pessoas.remove(nova);

    }

    public void remove(int indice) {
        BancoDeDados.pessoas.remove(indice);

    }

    public Pessoa search(String chave) {
        List<Pessoa> lista = BancoDeDados.pessoas;
        for (int i = 0; i < lista.size() ; i++) {
            Pessoa e = lista.get(i);
            if (e.getNome().equals(chave) ){
                return e;
            }
        }
        return null;
    }


}
