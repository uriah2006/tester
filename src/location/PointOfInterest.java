/* INAVSolutions 2013
 * Uriah Sypolt 
 * 
 */
package location;

public class PointOfInterest {
	private String type;
	private int id;

	public PointOfInterest(String type, int id) {
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "type=" + type + ", id=" + id + "\n";
	}

	public int totalWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
