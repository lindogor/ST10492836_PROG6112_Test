public abstract class Elecstore implements IElectstore{
    private String ConsoleType;
    private String Store;
    private double TotalSales;

    public Elecstore(String ConsoleType, String Store, double TotalSales)
    {
        this.ConsoleType=ConsoleType;
        this.Store=Store;
        this.TotalSales=TotalSales;
    }


}
