package DioBanco.entities;

public class Endereco {
    private String rua;
    private String cep;
    private Integer num;
    private String complemento;


    public Endereco(){

    }
    public Endereco(String rua, String cep, Integer num, String complemento) {
        this.rua = rua;
        this.cep = cep;
        this.num = num;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                ", num=" + num +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
