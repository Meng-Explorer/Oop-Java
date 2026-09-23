import Booking.CarBooking;
import Booking.CarBookingService;
import carPackage.Car;
import carPackage.carService;

import userPackage.UserService;
import userPackage.user;

import java.util.Scanner;
import java.util.UUID;


public class Main {
    public void main(){

        Scanner scanner = new Scanner(System.in);
        boolean keepLooping = true;
        UserService userService = new UserService();
        carService carService = new carService();
        CarBookingService carBookingService = new CarBookingService();

        while (keepLooping){
            displayMenu();
            System.out.print("Enter your choice: ");
            byte optionNumber = scanner.nextByte();
            switch (optionNumber){
                case 1 -> displayBookCar(userService,carBookingService,carService,scanner);
                case 2 -> displayAllUserBookCar(userService,carBookingService,scanner) ;
                case 3 -> displayAllBooking(carBookingService);
                case 4 -> displayAllcar(carService, false);
                case 5 -> displayAllcar(carService, true);
                case 6 -> displayAllUser(userService);
                case 7 -> {
                    System.out.println("7");
                    keepLooping = false;
                }
                default -> System.out.println("Value option not found");
            }
        }
        scanner.close();

    }

    private static void displayBookCar(UserService userService, CarBookingService carBookingService, carService carService, Scanner scanner){
        try{
            displayAllcar(carService,false);
            System.out.print("--> select car register number:");
            scanner.nextLine();
            String registerNumber = scanner.nextLine();
            Car car = carService.getCar(registerNumber);
            if(car == null){
                System.out.println("not found user" + registerNumber);
                return;
            }

            displayAllUser(userService);
            System.out.print("--> select user Id:");
            String userId = scanner.nextLine();
            user user = userService.getUserById(UUID.fromString(userId));
            if (user == null){
                System.out.println("Not found user this Id" + userId);
                return;
            }

            // implement of car booking action
            CarBooking carBooking = carBookingService.bookCar(user,car);

            System.out.println("Success" + car.getRegister() + "for user" + user.getId().toString() + "Booking reference" );


        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    private static void displayAllUserBookCar(UserService userService,CarBookingService carBookingService,Scanner scanner ){
        displayAllUser(userService);
        System.out.print("-> select  user Id : ");
        scanner.nextLine();
        String userId = scanner.nextLine();

        user user = userService.getUserById(UUID.fromString(userId));
        if(user == null){
            System.out.println("Not found user!");
            return;
        }

        Car[] userBookedCar = carBookingService.getUserBookedCar(user.getId());
        if(userBookedCar == null){
            System.out.println("User" + user + "has no cars Booked");
            return;
        }
        for ( Car car : userBookedCar){
            System.out.println(car);
        }


    }

    private static CarBooking[] displayAllBooking( CarBookingService carBookingService){
        CarBooking[] carBookings =  carBookingService.getAllCarBooking();
        if(carBookings.length == 0){
            System.out.println("Nothing Booking in the system!");
            return null;
        }
        for(CarBooking carBooking : carBookings){
            if(carBooking != null )
                System.out.println(carBooking);
        }
    return carBookings;
    }

    private static Car[] displayAllcar( carService carService ,boolean isElectric){
        Car[] cars = isElectric ? carService.getAllElectric() : carService.getAllCar();
        if(cars.length == 0){
            System.out.println("Nothing cars in the system!");
            return null;
        }
        for(Car car : cars){
            System.out.println(car);
        }
        return cars;
    }

    private static user[] displayAllUser(UserService userService){
        user[] users = userService.getUser();
        if (users.length == 0){
            System.out.println("Nothing User in the system!");
            return null;
        }
        for (user user : users){
            System.out.println(user);
        }
        return users;
    }

    private static void displayMenu(){
        System.out.println("_____Car Booking System_____");
        System.out.println("1- Book Car");
        System.out.println("2- View all user Booking Cars");
        System.out.println("3- View all Booking");
        System.out.println("4- View Available cars");
        System.out.println("5- View Available Electric Cars");
        System.out.println("6- View all user");
        System.out.println("7- Exit");
    }


}
