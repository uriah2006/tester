package location;

public class Main {

	public static void main(String[] args) {
		
		TestMap foo = new TestMap();
		foo.testFloorSetup();
		System.out.println(foo.getDirection1(802));
		//testing
		System.out.println(foo.getDirection2(802));

	}

}
