package carPackage;

public class carDao {
    private static  final Car[] CARS = {
            new Car("1234", 10.50,"TESLA",true),
            new Car("1234",10.30,"LEXUS",false ),
            new Car("1234",30.20,"FORD",false ),
            new Car("1234",30.20,"BMW",false ),
            new Car("1234",30.20,"AUDI",true )
    };
    public static Car[] getCars(){
        return CARS;
    }
}
