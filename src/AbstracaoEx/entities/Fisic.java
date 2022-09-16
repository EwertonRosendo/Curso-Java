package AbstracaoEx.entities;

public class Fisic extends TaxPayers {

    private Double saude;

    public Fisic(){
        super();
    }

    public Fisic(String name, Double anualIncome, Double saude) {
        super(name, anualIncome);
        this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }
}
