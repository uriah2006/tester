package nav;

public class Main {
	public static void main(String[] args) {
		
		String start = "elevators";
		String end = "800";
		floor8ESB test= new floor8ESB();
		System.out.println(test.getDirections(start, end));
	}


}
