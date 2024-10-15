package com.example;

public abstract class RoomDecorator implements Room{
    private Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public void printFurniture(){
        room.printFurniture();
    }
}
