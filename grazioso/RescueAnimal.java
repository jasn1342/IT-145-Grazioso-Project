public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private String acquisitionDate;
    private String statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private String trainingStart;
    private String trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    	name = "none";
    	type = "none";
    	gender = "unknown";
    	age = 0;
    	weight = 0;
    	acquisitionDate = "none";
    	statusDate = "none";
    	acquisitionSource = "none";
    	reserved = false;
    	trainingLocation = "none";
    	trainingStart = "none";
    	trainingEnd = "none";
    	inServiceCountry = "none";
    	inServiceCity = "none";
    	inServiceAgency = "none";
    	inServicePOC = "none";
    	inServiceEmail = "none";
    	inServicePhone = "none";
    	inServicePostalAddress = "none";
    	}

 // Accessor and Mutator Methods (Getters and Setters)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public String getAcquisitionSource() {
		return acquisitionSource;
	}

	public void setAcquisitionSource(String acquisitionSource) {
		this.acquisitionSource = acquisitionSource;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	public String getTrainingStart() {
		return trainingStart;
	}

	public void setTrainingStart(String trainingStart) {
		this.trainingStart = trainingStart;
	}

	public String getTrainingEnd() {
		return trainingEnd;
	}

	public void setTrainingEnd(String trainingEnd) {
		this.trainingEnd = trainingEnd;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public String getInServiceCountry() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public String getInServiceCity() {
		return inServiceCity;
	}

	public void setInServiceCity(String inServiceCity) {
		this.inServiceCity = inServiceCity;
	}

	public String getInServiceAgency() {
		return inServiceAgency;
	}

	public void setInServiceAgency(String inServiceAgency) {
		this.inServiceAgency = inServiceAgency;
	}

	public String getInServicePOC() {
		return inServicePOC;
	}

	public void setInServicePOC(String inServicePOC) {
		this.inServicePOC = inServicePOC;
	}

	public String getInServiceEmail() {
		return inServiceEmail;
	}

	public void setInServiceEmail(String inServiceEmail) {
		this.inServiceEmail = inServiceEmail;
	}

	public String getInServicePhone() {
		return inServicePhone;
	}

	public void setInServicePhone(String inServicePhone) {
		this.inServicePhone = inServicePhone;
	}

	public String getInServicePostalAddress() {
		return inServicePostalAddress;
	}

	public void setInServicePostalAddress(String inServicePostalAddress) {
		this.inServicePostalAddress = inServicePostalAddress;
	}
    
}
