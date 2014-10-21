package ponto.modulo;

import java.util.List;

/**
 * Created by juliosossai on 21/10/2014.
 */
public class Empresa {
    //atributos
    private String nome;

    private String cnpj;

    private String insc;

    //Agregação
    private List<Endereco> enderecoList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsc() {
        return insc;
    }

    public void setInsc(String insc) {
        this.insc = insc;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    //metodos -> comportamento

    public void cadastrarUsuario(){

    }
    public void cadastroEmpresa(){

    }


}
