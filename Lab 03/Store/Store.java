
public class Store {

	DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
	public static int qtyitemsInStore;
	
	public int getqtyitemsInStore() {
		return qtyitemsInStore;
	}
	public void addDVD(DigitalVideoDisc... dvds) {
		int i;
		for (DigitalVideoDisc dvd: dvds) {
			for (i=0;i<itemsInStore.length;i++){
				if (this.itemsInStore[i] == null){
					this.itemsInStore[i] = dvd ;
					qtyitemsInStore++;
					break;
				}
			}  
		}
	}
	public void removeDVD(DigitalVideoDisc dvd1) {
		for (DigitalVideoDisc dvd: itemsInStore) {
			if (dvd!=null) {
				if (dvd.equals(dvd1)) { dvd = null; qtyitemsInStore--;}
			}
		}
	}
}


