package Booking;

import carPackage.Car;
import userPackage.user;

import java.util.UUID;

public class CarBookingService {

    public CarBooking[] getAllCarBooking() {
        return CarBookingDao.getCarBooking();
    }
    public Car[] getUserBookedCar (UUID userId){
        return null;
    }

    public CarBooking bookCar(user user, Car car){
        return CarBookingDao.book(user,car);
    }

}
