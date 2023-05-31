import java.util.ArrayList;
import java.util.Scanner;



public class Aims {
    	private Store store = new Store();
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", " Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	    private Cart cart = new Cart();
		//use switch/case so that user can choose options
	    
		public static void showMenu() { 

			System.out.println("AIMS: "); 
	    	System.out.println("--------------------------------"); 
	    	System.out.println("1. View store"); 
	    	System.out.println("2. Update store"); 
	    	System.out.println("3. See current cart"); 
	    	System.out.println("0. Exit"); 
	    	System.out.println("--------------------------------"); 
	    	System.out.println("Please choose a number: 0-1-2-3"); 
	    }
	    
	    public void chooseFromMenu() {
	    	
	    				
	    	String options = null;
	    	Scanner scan = new Scanner(System.in);
	    	do {
	    		options = scan.nextLine();
	    		switch (options) {
	    			case "1": //view store
	    				store.showItems();//show all items
	    				Aims.storeMenu();//show storeMenu
	    				//store.chooseFromStoreMenu();
	    				break;
	    			
	    			case "2": //update store
	    			    Aims.updateStore();
	    				//add or remove a media
	    			    	String options1 = null;
	    			    	Scanner scan1 = new Scanner(System.in);
	    			    	String name = null;
	    			    	do {
	    			    		options1 = scan1.nextLine();
	    			    		switch (options1) {
	    			    			case "1": 
	    			    				System.out.println("u choose to add new. input the name:");
	    			    				name = scan1.nextLine();
	    			    		    	DigitalVideoDisc newdvd = new DigitalVideoDisc(name);

	    			    				store.addMedia(newdvd);
	    			    				break;
	    			    			
	    			    			case "2":
	    			    				System.out.println("u choose to remove. input the name:");
	    			    				name = scan1.nextLine();
	    			    				store.removeMedia(store.searchBytitle(name));
	    			    				break;
	    			    			
	    			    		}
	    			    	} while (!options1.equals("0")); //back to Aims menu
	    			    	
	    			    	System.out.println("Return to Aims menu" );
	    			    	Aims.showMenu();
	    			     
	    			    break;
	    				
	    			case "3"://see current cart
	    				cart.showItems();//show items in current cart
	    				Cart.cartMenu();//show cart menu
	    				cart.chooseFromCartMenu();
	    				break;
	    				    			 				
	    		}
	    	} while (!options.equals("0")); //exit
	    	System.out.println("u exit the program");
	    	
	    } 
		
	    public static void storeMenu() { 
	    	System.out.println("Options: "); 
	    	System.out.println("--------------------------------"); 
	    	System.out.println("1. See a media’s details"); 
	    	System.out.println("2. Add a media to cart"); 
	    	System.out.println("3. Play a media"); 
	    	System.out.println("4. See current cart"); 
	    	System.out.println("0. Back"); 
	    	System.out.println("--------------------------------"); 
	    	System.out.println("Please choose a number: 0-1-2-3-4");
		
		
		//public void chooseFromStoreMenu() {
	    	String options = null;
	    	Scanner scan = new Scanner(System.in);
	    	do {
	    		options = scan.nextLine();
	    		switch (options) {
	    			case "1": //see a media's details
	    				System.out.println("u choose 1store");
	    				break;
	    			
	    			case "2": //add media to cart
	    				System.out.println("u choose 2store");
	    				break;
	    				
	    			case "3"://play a media
	    				System.out.println("u choose 3store");
	    				break;
	    			case "4"://see current cart
	    				System.out.println("u choose 4store");
	    				break;
	    			
	    		}
	    	} while (!options.equals("0")); //back to Aims menu
	    	System.out.println("Return to Aims menu" );
	    	Aims.showMenu();
	    } 
	    
		public static void updateStore() {		
			System.out.println("Update menu:");
			System.out.println("1. Add new");
			System.out.println("2. Remove media");
			System.out.println("0. Back");

		}
		
		
    
	public static void main(String[] args) {
		Aims A1 = new Aims();
		
		

		
		Aims.showMenu();
		A1.chooseFromMenu();
	} 
}