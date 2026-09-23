package carPackage;

public class carService {
    public Car[] getAllCar(){
        return carDao.getCars();
    }
    public Car[] getAllElectric(){
        int countCar = 0;
        Car[] cars = carDao.getCars();
        for(Car car : cars){
            if(car.isElectric()) countCar += 1;
        }
        Car[] electricCar = new Car[countCar];
        int index = 0;
        for(int i=0;i < cars.length; i++){
            if (cars[i].isElectric() ){
                electricCar[index] = cars[i];
                index ++;
            }
        }
        return electricCar;
    }
    public Car getCar(String register){
        for(Car car : getAllCar()){
            if(car.getRegister().equals(register)){
                return car;
            }
        }
        return null;
    }
}
