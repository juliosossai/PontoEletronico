package ponto.model;

import java.util.List;

/**
 * Created by Vinicius on 27/10/2014.
 */
public class Pessoa {

    //atributos
    private String nome;
    private String numeroPis;
    private String cpf;
    private String rg;
    private List<Endereco> enderecoList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroPis() {
        return numeroPis;
    }

    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (cpf != null ? !cpf.equals(pessoa.cpf) : pessoa.cpf != null) return false;
        if (enderecoList != null ? !enderecoList.equals(pessoa.enderecoList) : pessoa.enderecoList != null)
            return false;
        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        if (numeroPis != null ? !numeroPis.equals(pessoa.numeroPis) : pessoa.numeroPis != null) return false;
        if (rg != null ? !rg.equals(pessoa.rg) : pessoa.rg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (numeroPis != null ? numeroPis.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (rg != null ? rg.hashCode() : 0);
        result = 31 * result + (enderecoList != null ? enderecoList.hashCode() : 0);
        return result;
    }
}
