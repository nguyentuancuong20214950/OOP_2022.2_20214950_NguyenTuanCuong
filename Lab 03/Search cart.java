public void searchbyID( int ID) {
    	for (DigitalVideoDisc i: this.itemsOrdered) {
    		if (i!= null) {
    			if (i.getID() == ID) {
    				 System.out.println(i.toString());
    				 break;
    				}
    			else 
    				{System.out.println("The ID you search isn't in the current cart"); }
    		}
    	}
    }
    public void searchbytitle( String title) {
    	for (DigitalVideoDisc i: itemsOrdered) {
    		if (i!= null) {
    			if (i.getTitle() == title) 
    				{ System.out.println(i.toString()); 
    				break;
    				}
    			else 
    				{System.out.println("The title you search isn't in the current cart");
    				break;
    				}
    		}
    	}
    }