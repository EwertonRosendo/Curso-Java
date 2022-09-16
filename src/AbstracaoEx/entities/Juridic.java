package AbstracaoEx.entities;

public class Juridic extends TaxPayers {
    private Double employees;

    public Juridic(){
        super();
    }

    public Juridic(String name, Double anualIncome, Double employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Double getEmployees() {
        return employees;
    }

    public void setEmployees(Double employees) {
        this.employees = employees;
    }

}
