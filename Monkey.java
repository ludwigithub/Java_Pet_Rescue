package grazioso2;

/**
 * IT 145: Intro to Software Development
 * 7-2 PROJECT TWO
 * Monkey.java 
 * Deonne Ludwig
 * 06/13/2022
 */


public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey(String name, String species, String tailLength, 
    String height, String bodyLength,  String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }
    
    public String getTailLength() {
        return tailLength;
    }

    public String getHeight() {
        return height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
    
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

}
