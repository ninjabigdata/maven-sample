package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.displayList();
    }
	
	public void displayList() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		System.out.println(list.toString());
	}
}