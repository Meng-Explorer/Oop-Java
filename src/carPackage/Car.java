package carPackage;

public class Car {
    private String register;
    private double rentalPricePerDay;
    private String brand;
    private boolean isElectric;

    public Car (String register, double rentalPricePerDay,String brand,boolean isElectric){
        this.register = register;
        this.rentalPricePerDay = rentalPricePerDay;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public String toString() {
        return "Car: " + "register='" + register + '\'' + ", rentalPricePerDay=" + rentalPricePerDay + "," +
                " brand='" + brand + '\'' + ", isElectric=" + isElectric;
    }
}
