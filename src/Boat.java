import java.io.Serializable;

public class Boat implements Serializable {
    //-----------------------------------------------------------------------
    public enum type{POWER,SAILING};

    FleetManagement.type theType;
    public String name;
    public int manufacturer;
    public String makeAndModel;
    public int length;
    public double purchasePrice;
    public double expenses;

    public Boat(){
        theType = null;
        name = null;
        manufacturer = 0;
        makeAndModel = null;
        length = 0;
        purchasePrice = 0;
        expenses = 0;
    }
    //-----------------------------------------------------------------------
    public Boat(FleetManagement.type theType, String name, int manufacturer, String makeAndModel, int length, double purchasePrice) {
        this.theType = theType;
        this.name = name;
        this.manufacturer = manufacturer;
        this.makeAndModel = makeAndModel;
        this.length = length;
        this.purchasePrice = purchasePrice;
        expenses = 0;
    }

    //-----------------------------------------------------------------------
    public String toString() {
        return ("    " + theType + " " + getName() + "                                 "
                + getManufacturer() + " " + getMakeAndModel() + "  :  Paid $ "
                + getPurchasePrice() + "  :  Spent $     " + expenses);
    }


    //-----------------------------------------------------------------------
    public void setType(){

    }
    //-----------------------------------------------------------------------
    public String getName() {
        return this.name;
    }
    //-----------------------------------------------------------------------
    public void setName(String name){
        this.name = name;
    }
    //-----------------------------------------------------------------------
    public int getManufacturer() {
        return this.manufacturer;
    }

    //-----------------------------------------------------------------------
    public void setManufacturer(int manufacturer){
        this.manufacturer = manufacturer;
    }

    //-----------------------------------------------------------------------
    public String getMakeAndModel() {
        return this.makeAndModel;
    }
    //-----------------------------------------------------------------------
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }
    //-----------------------------------------------------------------------
    public int getLength() {
        return this.length;
    }
    //-----------------------------------------------------------------------
    public void setLength(int length){
        this.length = length;
    }

    //-----------------------------------------------------------------------
    public double getPurchasePrice() {
        return purchasePrice;
    }
    //-----------------------------------------------------------------------
    public void setPurchasePrice(){


    }
    //-----------------------------------------------------------------------
    public double getExpenses() {

        return this.expenses;
    }
    //-----------------------------------------------------------------------
    public void setExpenses(double amountToSpend){
        this.expenses += amountToSpend;
    }

    //-----------------------------------------------------------------------
}


