
public class Room {
    private RoomTypes roomType;
    private int square;

    public Room(RoomTypes roomType, int square) {
        this.roomType = roomType;
        this.square = square;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Room type is " + roomType + ". Square is " + square + ".";

    }
}
