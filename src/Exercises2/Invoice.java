package Exercises2;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;
    public Invoice(){

    }
    public Invoice(String partnumber,String partdescription,int Quantity,double unitprice){
        partNumber=partnumber;
        partDescription=partdescription;
        quantity=Quantity;
        unitPrice=unitprice;
    }
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    public String getpartNumber(){
        return partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }

    public String getPartDescription(){
        return partDescription;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public double getUnitPrice(){
        if (unitPrice < 0) {
            return 0.0;
        }
        return unitPrice;
    }
    public double getInvoiceAmount(){
        if ((unitPrice*quantity)*2 < 0) {
            return 0;
        }
        return (quantity*unitPrice)*2;
    }
    @Override
    public String toString() {

        return "Part Number "+partNumber +"- Part Description "+ partDescription +" - Unit Price "+
                unitPrice+" - Quantity "+quantity+"-Invoice Amount "+getInvoiceAmount();
    }
public static void main(String [] agrs){
        Invoice in= new Invoice();
        in.setPartNumber("3");
        in.setPartDescription("The bill  3");
        in.setQuantity(18);
        in.setUnitPrice(2000);
    System.out.println(in.toString());
}
}
