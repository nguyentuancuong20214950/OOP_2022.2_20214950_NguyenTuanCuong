import java.text.MessageFormat;
public class DigitalVideoDisc extends Disc implements Playable {


	private String director;
	private int length;
	private static int nbDigitalVideoDisc = 0;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);	
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.setCost(cost);
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
	}
	public DigitalVideoDisc( float cost) {
		super();
		this.setCost(cost);
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
	}
	
	public String toString() {
		String pattern = "DVD: {0} - {1} - {2} - {3}: {4}$ ";
		//Object[] arguments = {this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost()};
		
		String output = MessageFormat.format(pattern, this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
		return output;
	}
	
	public void play() {
		if (this.getLength() <= 0) {
			System.out.println("Can't be play cause of the length");
		}
		else {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	}
}


