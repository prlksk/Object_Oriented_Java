
public class Dog extends Animal{
    private int bitenumber;
	public Dog(String name, String ownername, int footn, int height, boolean speak, int bitenumber) {
		super(name, ownername, footn, height, speak);
        this.setBitenumber(bitenumber);
        
	}
	public int getBitenumber() {
		return bitenumber;
	}
	public void setBitenumber(int bitenumber) {
		this.bitenumber = bitenumber;
	}
	public void show() {
		super.show();
		System.out.println("Bite number: "+ getBitenumber());
	}
        
}
