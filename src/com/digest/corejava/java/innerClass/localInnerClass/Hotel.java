package com.digest.corejava.java.innerClass.localInnerClass;

public class Hotel {
    private String name;
    private int totalRoom;
    private int reservedRoom;

    public Hotel(String name, int totalRoom, int reservedRoom) {
        this.name = name;
        this.totalRoom = totalRoom;
        this.reservedRoom = reservedRoom;
    }
    public  void reservedRoom(String guestName, int numberOfRooms){
        class ReservationValidator{
            boolean validate (){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty !");
                    return false;
                }
                if(numberOfRooms<0){
                    System.out.println("Invalid Room Number");
                    return false;
                }
                if(reservedRoom +numberOfRooms > totalRoom){
                    System.out.println("Not enough rooms available");
                    return  false;
                }
                return true;
            }
        }
        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRoom += numberOfRooms;
            System.out.println("Reservation confirmed for "+guestName+ " for "+numberOfRooms + " rooms");
        }
        else {
            System.out.println("Reservaton Failed");
        }
    }
}