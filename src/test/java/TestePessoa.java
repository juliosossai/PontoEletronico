import org.junit.Test;
import ponto.bancoDeDados.BancoDeDados;
import ponto.domain.PessoaBussines;
import ponto.model.Endereco;
import ponto.model.Pessoa;


import java.util.ArrayList;

/**
 * Created by juliosossai on 12/11/2014.
 */
public class TestePessoa {

    @Test
    public void testaPessoa(){

        Pessoa nova = new Pessoa();

        nova.setNome("Pessoa Nova");
        nova.setCpf("02612559914");
        nova.setRg("75511817");

        ArrayList<Pessoa> enderecos = new ArrayList<Pessoa>();

        Endereco p1 = new Endereco();
        p1.setLogradouro("Rua Santo Indalécio");
        p1.setCep("87175000");
        p1.setBairro("Centro");
        p1.setCidade("Itambé");
        p1.setEstado("PR");
        p1.setNumero("385");

        enderecos.add(p1);

        nova.setEnderecoList(enderecos);

        Pessoa dados = new Pessoa();

        PessoaBussines bussines = new PessoaBussines();

        bussines.salvar(nova);

        bussines.listarTudo();

        Pessoa e3 = bussines.procuraDados("Pessoa ");

        if (e3!=null){
            System.out.println("Pessoa encontrada: "+e3);
        }



    }
}
