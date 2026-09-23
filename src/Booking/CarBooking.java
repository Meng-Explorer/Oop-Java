package Booking;

import carPackage.Car;
import userPackage.user;
import java.util.Date;
import java.util.UUID;

public class CarBooking {
//    public int length;
    private UUID Id;
    private user user;
    private Car car;
    private Date bookingTime;
    private boolean isCancel;

    public CarBooking(UUID id, boolean isCancel, Date bookingTime, Car car, user user) {
        Id = id;
        this.isCancel = isCancel;
        this.bookingTime = bookingTime;
        this.car = car;
        this.user = user;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public boolean isCancel() {
        return isCancel;
    }

    public void setCancel(boolean cancel) {
        isCancel = cancel;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CarBooking: " + "Id=" + Id + ", user=" + user + ", car=" + car + ", bookingTime=" + bookingTime + ", isCancel=" + isCancel;
    }
}
