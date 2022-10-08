package DioBanco.entities;

public class Conta {
    private Integer id;
    private String usuario;
    private Double saldo;
    private String contato;
    private Endereco endereco;

    public Conta (){

    }

    public Conta(Integer id, String usuario, Double saldo, String contato, Endereco endereco) {
        this.id = id;
        this.usuario = usuario;
        this.saldo = saldo;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void withdraw(Double retirada){
        if (saldo>=retirada){
            saldo -= retirada;
        }else {
            System.out.println("Retirada negada");
        }
    }

    public void deposit(Double deposit){
        saldo+=deposit;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", saldo=" + saldo +
                ", contato='" + contato + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
