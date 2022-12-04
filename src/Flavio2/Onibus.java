package Flavio2;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public Onibus() {
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "assentos=" + assentos +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
