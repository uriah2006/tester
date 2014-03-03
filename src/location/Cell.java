package location;

public class Cell {

	int roomNumber;
	boolean door;
	
	
	public Cell(int roomNumber, boolean door) {
		super();
		this.roomNumber = roomNumber;
		this.door = door;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public boolean isDoor() {
		return door;
	}

}
