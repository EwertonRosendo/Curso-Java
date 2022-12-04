package Flavio2;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public Caminhao() {

    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "eixos=" + eixos +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
