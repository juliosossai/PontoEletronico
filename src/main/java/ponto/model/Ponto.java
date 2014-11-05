package ponto.model;

/**
 * Created by Vinicius on 27/10/2014.
 */
public class Ponto {

    //Atributos
    private String data;
    private String horaRegistro;
    private Pessoa  pessoa;
    private Empresa empresa;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(String horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ponto)) return false;

        Ponto ponto = (Ponto) o;

        if (!data.equals(ponto.data)) return false;
        if (!empresa.equals(ponto.empresa)) return false;
        if (!horaRegistro.equals(ponto.horaRegistro)) return false;
        if (!pessoa.equals(ponto.pessoa)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = data.hashCode();
        result = 31 * result + horaRegistro.hashCode();
        result = 31 * result + pessoa.hashCode();
        result = 31 * result + empresa.hashCode();
        return result;
    }
}
