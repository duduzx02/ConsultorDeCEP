package ViaCep.API;

public class Cep implements Comparable<Cep>{
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Cep(String cep){
        this.cep = cep;
    }

    public Cep(CepRecord cepRecord){
        this.cep = cepRecord.cep();
        this.logradouro = cepRecord.logradouro();
        this.bairro = cepRecord.bairro();
        this.localidade = cepRecord.localidade();
        this.uf = cepRecord.uf();
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Cep { " +
                "cep = " + cep +
                ", logradouro = " + logradouro +
                ", bairro = " + bairro +
                ", localidade = " + localidade +
                ", uf = " + uf +
                '}';
    }

    @Override
    public int compareTo(Cep outroCep) {
        return this.getCep().compareTo(outroCep.getCep());
    }
}
