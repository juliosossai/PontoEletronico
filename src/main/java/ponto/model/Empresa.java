package ponto.model;

import java.util.List;

/**
 * Created by Vinicius on 21/10/2014.
 */
public class Empresa {

    //atributos
    private String nome;
    private String cnpj;
    private String inscricaoEstadual;
    private List<Endereco> enderecoList;

    //Métodos Acessores
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

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    //Agregação
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    //Métodos de negocios
    public void cadastrarUsuario(){

    }

    public void cadastroEmpresa(){

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", enderecoList=" + enderecoList +
                '}';
    }
}
