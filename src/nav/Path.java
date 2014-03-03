package nav;

class Path {
	public final PointOfInterest destination;
	public final double distance;

	public Path(PointOfInterest destination, double distance) {
		this.destination = destination;
		this.distance = distance;
	}

}