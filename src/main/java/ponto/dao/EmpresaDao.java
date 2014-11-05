package ponto.dao;

import ponto.bancoDeDados.BancoDeDados;
import ponto.model.Empresa;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class EmpresaDao {

    public void persist(Empresa nova) {
        BancoDeDados.empresas.add(nova);

    }

    public void update(int index ,Empresa nova) {
        BancoDeDados.empresas.set(index, nova);

    }

    public void remove(Empresa nova) {
        BancoDeDados.empresas.remove(nova);

    }

    public void remove(int indice) {
        BancoDeDados.empresas.remove(indice);

    }

    public void search(String chave) {


    }
}
