package hotel.hotelReservationSystem;

import hotel.human.Guest.Guest;
import hotel.human.Guest.VIPGuest;

import java.util.Scanner;

public class GuestService {

    public Guest create() {
        Scanner cc = new Scanner(System.in);
        Guest guest=new Guest();
        System.out.println("Enter Guest first name");
        guest.setFirstName(cc.next()); //ay stex nayi voncem tvel takinnernel tenc poxi lriv
        System.out.println("Enter Guest last name");
        String lastName = cc.next();
        System.out.println("Enter Guest address");
        String address = cc.next();
        System.out.println("Enter Guest gender, m/f");
        char gender = cc.next().charAt(0);
        System.out.println("Enter Guest contact");
        int contact = cc.nextInt();
        System.out.println("Enter Guest nationality");
        String nationality = cc.next();
        System.out.println("Enter Guest year of Birth ");
        int year = cc.nextInt();
        System.out.println("Enter Guest email");
        String email = cc.next();
        System.out.println("Enter Guest Phone number");
        long thePhone = cc.nextLong();
        System.out.println("Enter Guest marital status, Y/N");
        char maritalStatus = cc.next().charAt(0);
        System.out.println("Enter Guest Credit Card number");
        String creditCard = cc.next();
        System.out.println("Enter Guest Customer Id");
        long customerId = cc.nextLong();
        System.out.println("Enter Guest documentNo");
        String documentNo = cc.next();
        System.out.println("Enter Guest Reservation Id");
        long reservationId = cc.nextLong();
        return guest;
    }

    public VIPGuest createVip() {
        Scanner m = new Scanner(System.in);
        VIPGuest vipGuest = (VIPGuest) create();//sencel petqa vor ashxati
        System.out.println("Enter VIPGuest vip");
        vipGuest.setVip(m.next());
        System.out.println("Enter VIPGuest rentalId");
        vipGuest.setRentalId(m.nextInt());
        return vipGuest;
    }

    public void printFullNamesOfGuests(Guest g1, Guest g2, Guest g3) {
        System.out.println(g1.fullName());
        System.out.println(g2.fullName());
        System.out.println(g3.fullName());

    }

    public void printAllGuestsEmail(Guest guest1, Guest g2, Guest g3) {
        System.out.println(guest1.email);
        System.out.println(g2.email);
        System.out.println(g3.email);
    }

    public Guest[] printAllGuestsSortedByYear(Guest[] guests) {
        boolean isActive = true;
        int countOfFors = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < guests.length - 1 - countOfFors; i++) {
                if (guests[i].getYear() > guests[i + 1].getYear()) {
                    Guest x = guests[i];
                    guests[i] = guests[i + 1];
                    guests[i + 1] = x;
                    isActive = true;
                }
            }
            countOfFors++;
        }
        return guests;

    }


}










