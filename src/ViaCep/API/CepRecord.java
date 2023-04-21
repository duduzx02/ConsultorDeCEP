package ViaCep.API;


public record CepRecord(String cep, String logradouro, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "CepRecord{" +
                "cep = " + cep +
                ", logradouro = " + logradouro +
                ", bairro = " + bairro +
                ", localidade = " + localidade +
                ", uf= " + uf +
                '}';
    }
}
