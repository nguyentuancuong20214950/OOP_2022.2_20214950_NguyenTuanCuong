
public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public void play() {
		System.out.print("Playing Track: " + this.getTitle());
		System.out.print("  Track length: " + this.getLength());
		System.out.println(" ");
	}
	
	public boolean equals(Track disc) {
		return (this.getTitle() == disc.getTitle() & this.getLength() == disc.getLength());
	}
	public Track() {
	}
		// TODO Auto-generated constructor stub
	}


