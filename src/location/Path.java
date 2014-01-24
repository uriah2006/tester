/* INAVSolutions 2013
 * Uriah Sypolt 
 * 
 */
package location;

public class Path {
	private String discription;
	private int weight;
	private PointOfInterest start;
	private PointOfInterest end;

	public Path(String direction, int weight, PointOfInterest start, PointOfInterest end) {
		this.discription = direction;
		this.weight = weight;
		this.start = start;
		this.end = end;

	}

	public String getDiscription() {
		return discription;
	}

	public int getWeight() {
		return weight;
	}

	public PointOfInterest getStart() {
		return start;
	}

	public PointOfInterest getEnd() {
		return end;
	}
	
	public int totalWeight() {
		return weight+end.totalWeight();
	}
	
	@Override
	public String toString() {
		return "Path discription=" + discription + ", weight=" + weight
				+ ", start=" + start + ", end=" + end + "\n";
	}
	
}
