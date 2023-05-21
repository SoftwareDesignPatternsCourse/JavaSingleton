import com.milkyway.objects.Planet;
import com.milkyway.objects.Star;

public class MilkyWayApplication {

	public static void main(String[] args) {
		Planet mercury = new Planet("Mercury", 2439.7, 3.3011e23, "Rocky");
	    Planet venus = new Planet("Venus", 6051.8, 4.8675e24, "Rocky");
	    Planet earth = new Planet("Earth", 6371, 5.972e24, "Rocky");
	    Planet mars = new Planet("Mars", 3389.5, 6.4171e23, "Rocky");
	    Planet jupiter = new Planet("Jupiter", 69911, 1.8982e27, "Gas Giant");
	    Planet saturn = new Planet("Saturn", 58232, 5.6834e26, "Gas Giant");
	    Planet uranus = new Planet("Uranus", 25362, 8.6810e25, "Ice Giant");
	    Planet neptune = new Planet("Neptune", 24622, 1.02413e26, "Ice Giant");

	    mercury.displayInfo();
	    venus.displayInfo();
	    earth.displayInfo();
	    mars.displayInfo();
	    jupiter.displayInfo();
	    saturn.displayInfo();
	    uranus.displayInfo();
	    neptune.displayInfo();

	    Star sun = new Star("Sun", 696342, 1.989e30, "G-type");
        Star sirius = new Star("Sirius", 1674000, 2.063e30, "A1V");
        Star betelgeuse = new Star("Betelgeuse", 936000000, 1.434e31, "M1-M2Ia-Iab");
        
        sun.displayInfo();
        sirius.displayInfo();
        betelgeuse.displayInfo();
	    
	}

}
