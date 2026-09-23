package Booking;

import carPackage.Car;
import userPackage.user;

import java.util.Date;
import java.util.UUID;

public class CarBookingDao {

    private static CarBooking[] carBookings;   // ប្ដូរឈ្មោះ variable

    static {
        carBookings = new CarBooking[10];
    }

    public static CarBooking[] getCarBooking(){
        return carBookings;
    }

    public static void setCarBooking(CarBooking[] newCarBooking){
        carBookings = newCarBooking;
    }

    public static CarBooking book(user user, Car car) {

        // បង្កើត object ថ្មី
        CarBooking newBooking =
                new CarBooking(UUID.randomUUID(), false, new Date(),car,user);

        int nextFreeIndex = -1;

        for (int i = 0; i < carBookings.length; i++){
            if (carBookings[i] == null){
                nextFreeIndex = i;
                break;
            }
        }

        CarBooking carBooking = null;
        if (nextFreeIndex > -1){
            carBookings[nextFreeIndex] = newBooking;
            return carBooking;
        }

        // បង្កើត array ធំជាងមុន
        CarBooking[] biggerCar = new CarBooking[carBookings.length + 10];

        for (int i = 0; i < carBookings.length; i++){
            biggerCar[i] = carBookings[i];
        }

        biggerCar[carBookings.length] = newBooking;
        setCarBooking(biggerCar);
        return carBooking;
    }
}