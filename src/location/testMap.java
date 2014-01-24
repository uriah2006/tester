/* INAVSolutions 2013
 * Uriah Sypolt 
 * 
 */
package location;

import java.util.ArrayList;
import java.util.List;

import location.PointOfInterest;
import location.Path;

public class testMap {
	List<PointOfInterest> lPOI = new ArrayList<PointOfInterest>();
	List<PointOfInterest> lRoom = new ArrayList<PointOfInterest>();
	List<Path> lPath = new ArrayList<Path>();
	
	//these will be inharited	
	int room = 7;
	int floor = 8;
	int intersec = 7;
	
	public void testFloorSetup() {
		// map
		// class 801
		// .....|
		// .....v
		// 5--------2--------4
		// | .......|....... |
		// |....... |....... |
		// | .......1....... |<-class 802
		// | .......|....... |
		// | .......|....... |
		// 7--------3--------6
		// ............^
		// ............|
		// .......class 803
		//
		
		// rooms
		// rooms is the number of rooms
		// floor is the floor you are on
		int i = floor * 100; // floor number
		int j = i + room; // number to go to

		for (; i < j + 1; i++) {
			this.lRoom.add(new PointOfInterest("class", i));
		}

		// intersections
		// intersec is the number of intersections you need
		
		j = i + intersec;
		for (; i < j + 1; i++) {
			this.lPOI.add(new PointOfInterest("intersection", i));
		}

		// halls
		lPath.add(new Path("go north", 2, lPOI.get(1), lPOI.get(2)));
		lPath.add(new Path("go south", 2, lPOI.get(1), lPOI.get(3)));
		lPath.add(new Path("go east", 2, lPOI.get(2), lPOI.get(4)));
		lPath.add(new Path("go west", 2, lPOI.get(2), lPOI.get(5)));
		lPath.add(new Path("go east", 2, lPOI.get(3), lPOI.get(6)));
		lPath.add(new Path("go west", 2, lPOI.get(3), lPOI.get(7)));
		lPath.add(new Path("go south", 4, lPOI.get(4), lPOI.get(6)));
		lPath.add(new Path("go west", 4, lPOI.get(3), lPOI.get(7)));

		// to classes
		lPath.add(new Path("room 801", 1, lPOI.get(2), lRoom.get(1)));// class 801
		lPath.add(new Path("room 802", 2, lPOI.get(3), lRoom.get(3)));// class 802
		lPath.add(new Path("room 803", 2, lPOI.get(4), lRoom.get(2)));// class 803
	}
	
	//test functions**********************************************************
	public String getDirection1(int room) {
		int roomNumber = room-(floor*100);
		PointOfInterest end = lRoom.get(roomNumber);
		return end.getType()+" "+end.getId();
	}
	
	
	public String getDirection2(int room) {
		int roomNumber = room-(floor*100)+intersec;
		Path end = lPath.get(roomNumber);
		return end.toString();
	}
}