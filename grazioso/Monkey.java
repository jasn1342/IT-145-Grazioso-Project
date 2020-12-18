
public class Monkey extends RescueAnimal{

	//Instance Variables
	private double tailLength;
	private double height; 
	private double bodyLength;
	private String species;
	private double torsoMeasure;
	private double skullMeasure;
	private double neckMeasure;
	
	//Constructors
	public Monkey () {
		tailLength = 0.0;
		height = 0.0;
		bodyLength = 0.0;
		species = "none";
		torsoMeasure = 0.0;
		skullMeasure = 0.0;
		neckMeasure = 0.0;
	}

	//Getters and Setters (Accessors and Mutators)
	public double getTailLength() {
		return tailLength;
	}

	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getTorsoMeasure() {
		return torsoMeasure;
	}

	public void setTorsoMeasure(double torsoMeasure) {
		this.torsoMeasure = torsoMeasure;
	}

	public double getSkullMeasure() {
		return skullMeasure;
	}

	public void setSkullMeasure(double skullMeasure) {
		this.skullMeasure = skullMeasure;
	}

	public double getNeckMeasure() {
		return neckMeasure;
	}

	public void setNeckMeasure(double neckMeasure) {
		this.neckMeasure = neckMeasure;
	}
	
}