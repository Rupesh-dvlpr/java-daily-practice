package objectMethods;

/**You are developing a Hotel Room Booking System used by an international hotel chain.

Each room booking is uniquely identified by a combination of room number and hotel code.
To support efficient storage and lookup in hash-based collections, you must override the hashCode() method using multiple fields instead of a single field.

This problem focuses on creating a composite hash code using real-world identifiers.

Class Details

Create a class named HotelRoomBooking.

Data Members
String hotelCode // unique hotel identifier
int roomNumber // room number in the hotel
String guestName // name of the guest
int nights // number of nights booked

Constructor
HotelRoomBooking(String hotelCode, int roomNumber, String guestName, int nights)
Initializes all fields.

Override hashCode()

Logic
Generate hash code using both hotelCode and roomNumber.
Example approach:
hotelCode.hashCode() + roomNumber

Main Class Details

Create a class named HotelApp.

Use Scanner to read details of two bookings:
Hotel code
Room number
Guest name
Number of nights

Create two HotelRoomBooking objects.
Print the hash codes of both objects.

If hash codes are equal → print
Hash codes are equal

Else → print
Hash codes are different*/
import java.util.*;

public class HashCodeMethod {
    public static void main(String[] args) {
       String hotelCode = IO.readln("Enter hotel Code: ");
       int roomNumber = Integer.parseInt(IO.readln("Enter room Number: "));
       String guestName = IO.readln("Enter guest name: ");
       int nights = Integer.parseInt(IO.readln("Enter number of nights: "));

       HotelRoomBooking hotelRoomBooking = new HotelRoomBooking(hotelCode, roomNumber, guestName, nights); 
       IO.println("Booking1 hashCode: "+hotelRoomBooking.hashCode());

       String hotelCode2 = IO.readln("Enter hotel Code: ");
       int roomNumber2 = Integer.parseInt(IO.readln("Enter room Number: "));
       String guestName2 = IO.readln("Enter guest name: ");
       int nights2 = Integer.parseInt(IO.readln("Enter number of nights: "));

       HotelRoomBooking hotelRoomBooking2 = new HotelRoomBooking(hotelCode2, roomNumber2, guestName2, nights2);    
       IO.println("Booking2 hashCode: "+hotelRoomBooking2.hashCode());

       if(hotelRoomBooking.equals(hotelRoomBooking2)){
        IO.println("Hash codes are equal");
       }else{
        IO.println("Hash codes are different");
       }  
    }
}


class HotelRoomBooking{
    private String hotelCode;
    private int roomNumber;
    private String guestName;
    private int nights;

    HotelRoomBooking(String hotelCode, int roomNumber, String guestName, int nights){
        if(roomNumber <= 0){
            IO.println("Error: Hotel code length must be 2-10 and room number must be greater than zero");
            System.exit(0);
        }
         this.hotelCode = hotelCode;
         this.roomNumber = roomNumber;
         this.guestName = guestName;
         this.nights = nights; 
         
    }

    @Override
    public int hashCode(){
        return hotelCode.hashCode() + roomNumber;
    }

    @Override
    public boolean equals(Object obj){
        String hotelcode1 = this.hotelCode;
        int room1 = this.roomNumber;

        HotelRoomBooking hotelRoomBooking2 = (HotelRoomBooking)obj;
        String hotelcode2 = hotelRoomBooking2.hotelCode;
        int room2 = hotelRoomBooking2.roomNumber;
        if(hotelcode1.equals(hotelcode2) && room1 == room2){
            return true;
        }else{
            return false;
        }
    }


}