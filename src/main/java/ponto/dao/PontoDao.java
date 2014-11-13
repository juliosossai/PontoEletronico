package ponto.dao;

import ponto.bancoDeDados.BancoDeDados;
import ponto.model.Ponto;

import java.util.List;

/**
 * Created by juliosossai on 12/11/2014.
 */
public class PontoDao {

    public void persist(Ponto nova) {
        BancoDeDados.pontos.add(nova);

    }

    public void update(int index ,Ponto nova) {
        BancoDeDados.pontos.set(index, nova);

    }

    public void remove(Ponto nova) {
        BancoDeDados.pontos.remove(nova);

    }

    public void remove(int indice) {
        BancoDeDados.pontos.remove(indice);

    }

    public Ponto search(String chave) {
        List<Ponto> lista = BancoDeDados.pontos;
        for (int i = 0; i < lista.size() ; i++) {
            Ponto e = lista.get(i);
            if (e.getData().equals(chave) ){
                return e;
            }
        }
        return null;
    }
}
