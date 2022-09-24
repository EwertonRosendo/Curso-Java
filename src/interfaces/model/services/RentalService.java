package interfaces.model.services;


import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    //public BrazilTaxService getBrazilTaxService() {
     //   return brazilTaxService;
    //}

    //public void setBrazilTaxService(BrazilTaxService brazilTaxService) {
      //  this.brazilTaxService = brazilTaxService;
    //}

    public void processInvoice(CarRental carRental){
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2-t1)/1000/60/60;
        double basicPayment;
        if(hours<=12){
            basicPayment = Math.ceil(hours) * pricePerHour;

        }else{
            basicPayment = Math.ceil(hours/24) * pricePerDay;

        }
        double tax = taxService.tax(basicPayment);



    }
}
