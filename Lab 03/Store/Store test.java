

public class StoreTest {
    public static void main (String[] args){
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", " Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Store store = new Store();
        store.addDVD(dvd1, dvd2, dvd3);
        System.out.println(store.getqtyitemsInStore());

        store.removeDVD(dvd2);
        System.out.println(store.getqtyitemsInStore());

    }
}