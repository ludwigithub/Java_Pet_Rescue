package grazioso2;

/**
 * IT 145: Intro to Software Development
 * 7-2 PROJECT TWO
 * Driver.java 
 * Deonne Ludwig
 * 06/13/2022
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();


    // Instance variables (if needed)

    public static void main(String[] args) {
    	
        
    	// Create a Scanner and pass it to the necessary methods
    	Scanner scanner = new Scanner(System.in);
        
        String menuChoice = ""; //Local variable
                
        initializeDogList();
        initializeMonkeyList();


        // For the project submission you must also include input validation
        // and appropriate feedback to the user.


        // Add a loop that displays the menu
        do{
            displayMenu();
        	menuChoice = scanner.nextLine(); //accepts the users input
      // and takes the appropriate action
        	if(menuChoice.equals("1")) {
        		intakeNewDog(scanner);     
        	}
        	else if(menuChoice.equals("2")) {
        		intakeNewMonkey(scanner);
        	}
        	else if(menuChoice.equals("3")) {
        		reserveAnimal(scanner);
        	}
            // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        	else if(menuChoice.equals("4")) {
        		printAnimals("dog");//dog
        	}
        	else if(menuChoice.equals("5")) {
        		printAnimals("monkey");//monkey
        	}
        	else if(menuChoice.equals("6")) {
        		printAnimals("available");//available
        	}
        	else if(menuChoice.equals("q")) {
        		System.out.println("Goodbye. Please visit us again!");
        		break;
        	}
        	else {
        		System.out.println("Invalid Choice");
        	}
        }while(!menuChoice.equalsIgnoreCase("q")); 
    }
        	
    
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n");
    	System.out.println("-------------~ o ~-------------");
    	System.out.println( "Welcome to Grazioso Salvare");
        System.out.println("RESCUE ANIMAL SYSTEM MAIN MENU");
    	System.out.println("-------------~ o ~-------------");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", true, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in-service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Katie", "Capuchin", "female", "1", "9.2", "22", "21", "43", "05-12-2022", "United States", "intake", false, "United States");
    	Monkey monkey2 = new Monkey("Mosh", "Marmoset", "male", "3", "0.82", "7", "8", "14", "02-28-2020", "United States", "Phase I", true, "United States");
    	Monkey monkey3 = new Monkey("Mumphry", "Guenon", "male", "10", "8.3", "21", "12", "33", "11-03-2018", "Canada", "in-service", false, "Canada");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine(); 
                             
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine(); 
             
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
             
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
             
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
             
        System.out.println("What is the dog's acquisition location? (United States | Canada)");
        String acquisitionCountry = scanner.nextLine();
             
        System.out.println("What is the dog's training status?"
        + "\n(intake | Phase I | Phase II | Phase III | Phase IV | Phase V | in-service)");
        String trainingStatus = scanner.nextLine();
             
        System.out.println("Is the dog reserved: true or false?");
        boolean reserved = scanner.nextBoolean();
             
        System.out.println("What is the dog's service country? (United States | Canada)");
        String inServiceCountry = scanner.next();
            
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate,
        		acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        		dogList.add(newDog);
        		System.out.println("\n");
        		System.out.println("The intake has been submitted for your dog."
        	    + "\nA staff person will contact you to follow up with the next step in the process. Thank you!"
        	    + "\nRETURNING YOU TO THE MAIN MENU...");
              
 	}


        // Complete intakeNewMonkey
		//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
		// to make sure the monkey doesn't already exist and the species type is allowed
	public static void intakeNewMonkey(Scanner scanner) {
       System.out.println("What is the monkey's name?");
       String name = scanner.nextLine();
       for(Monkey monkey: monkeyList) {
    	   if(monkey.getName().equalsIgnoreCase(name)) {
    		   System.out.println("\n\nThis monkey is already in our system\n\n");
               return; //returns to menu
           }
       }
            
       System.out.println("What is the monkey's species?"
       + "\nThe accepted species of monkey are listed below:"
       +"\nCapuchin" + "\nGuenon" + "\nMacaque" + "\nMarmoset" + "\nSquirrel Monkey" + "\nTamarin");
       String species = scanner.nextLine();
       if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && 
    	 !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && 
    	 !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))){
    		   System.out.println("\nThis monkey species is not eligible for training."
    		   + "\nRETURNING YOU TO THE MAIN MENU...");
               return; //returns to menu
       }
                            
       System.out.println("What is the monkey's gender?");
       String gender = scanner.nextLine(); 
            
       System.out.println("What is the monkey's age?");
       String age = scanner.nextLine();
            
       System.out.println("What is the monkey's weight?");
       String weight = scanner.nextLine();
            
       System.out.println("What is the monkey's tail length?");
       String tailLength = scanner.nextLine();   
            
       System.out.println("What is the monkey's height?");
       String height = scanner.nextLine();
            
       System.out.println("What is the monkey's body length?");
       String bodyLength = scanner.nextLine();
            
       System.out.println("What is the monkey's acquisition aate?");
       String acquisitionDate = scanner.nextLine();
            
       System.out.println("What is the monkey's acquisition location? (United States | Canada)");
       String acquisitionCountry = scanner.nextLine();
            
       System.out.println("What is the monkey's training status?"
       + "\n(intake | Phase I | Phase II | Phase III | Phase IV | Phase V | in-service)");
       String trainingStatus = scanner.nextLine();
            
       System.out.println("Is the monkey reserved: true or false?");
       boolean reserved = scanner.nextBoolean();
            
       System.out.println("What is the monkey's service country?(United States | Canada)");
       String inServiceCountry = scanner.next();
           
       Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength,
       height, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
       		monkeyList.add(newMonkey);
       		System.out.println("\n");
       		System.out.println("The intake has been submitted for your monkey."
       		+ "\nA staff person will contact you to follow up with the next step in the process. Thank you!"
            + "\nRETURNING YOU TO THE MAIN MENU...");
             
	}

	// Complete reserveAnimal
	// You will need to find the animal by animal type and in service country
	public static void reserveAnimal(Scanner scanner) {
        System.out.println("What animal would you like to reserve? dog or monkey");
        String animalType = scanner.nextLine();
        System.out.println("We are currently only offering service in limited areas. \nWill the service be in: United States or Canada");
        String inServiceCountry = scanner.nextLine();
        if (animalType.equalsIgnoreCase("dog")){
            for (Dog dog : dogList) {
                if(!dog.getReserved()) {
                    if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
                        dog.setReserved(true);
                        System.out.println("\n");
                        System.out.println("Your reservation has been submitted. "
                        + "\nA staff person will contact you to finish the process. Thank you!"
                        + "\nRETURNING YOU TO THE MAIN MENU...");
                    }
                    else {
                    	System.out.println("\n");
                        System.out.println("\n\nSorry there are no results. "
                        + "\nPlease contact the office for further assistance. "
                        + "\n555-555-5555 or help@grazioso.com"
                        + "\nRETURNING YOU TO THE MAIN MENU...");
                    }
                    return;
                }
            }
        }
        else if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (!monkey.getReserved()) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
                        monkey.setReserved(true);
                        System.out.println("\n");
                        System.out.println("Your reservation has been submitted. "
                        + "\nA staff person will contact you to finish the process. Thank you!"
                        + "\nRETURNING YOU TO THE MAIN MENU...");
                    }
                    else {
                    	System.out.println("\n");
                    	System.out.println("\n\nSorry there are no results. "
                                + "\nPlease contact the office for further assistance. "
                                + "\n555-555-5555 or help@grazioso.com"
                                + "\nRETURNING YOU TO THE MAIN MENU...");
                    }
                    return;
                }
            }
        }
    }
	
	
        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
        // Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
        // Remember that you only have to fully implement ONE of these lists. 
        // The other lists can have a print statement saying "This option needs to be implemented".
        // To score "exemplary" you must correctly implement the "available" list.
	
	public static void printAnimals(String listType) {
        if(listType.equals("dog")) {
        	System.out.println("LIST OF ALL DOGS:");
            for(Dog dog: dogList) {
            	System.out.println("\n");
                System.out.println("Name: " + dog.getName() + "\nBreed: " + dog.getBreed()
                + "\nGender: " + dog.getGender() + "\nAge: " + dog.getAge() + "\nWeight: " + dog.getWeight()
                + "\nAcquisition Date: " + dog.getAcquisitionDate() 
                + "\nAcquisition Country: " + dog.getAcquisitionLocation() 
                + "\nReserved: " + dog.getReserved() + "\nTraining Status: " + dog.getTrainingStatus() 
                + "\nService country: " + dog.getInServiceLocation());
            }
        }
        else if(listType.equals("monkey")) {
        	System.out.println("LIST OF ALL MONKEYS:");
            for(Monkey monkey: monkeyList) {
            	System.out.println("\n");
                System.out.println("Name: " + monkey.getName() + "\nSpecies: " + monkey.getSpecies()
                + "\nTails Length: " + monkey.getTailLength() + "\nHeight: "+ monkey.getHeight()
                + "\nBody Length: " + monkey.getBodyLength() + "\nGender: " + monkey.getGender()
                + "\nAge: " + monkey.getAge() + "\nWeight: " + monkey.getWeight()
                + "\nAcquisition Date: " + monkey.getAcquisitionDate() 
                + "\nAcquisition Country: " + monkey.getAcquisitionLocation()
                + "\nTraining Status: " + monkey.getTrainingStatus()
                + "\nReserved: " + monkey.getReserved()
                + "\nService country: " + monkey.getInServiceLocation());
            }
        }
        else if(listType.equals("available"))  {
        	System.out.println("\n");
        	System.out.println("LIST OF AVAILABLE DOGS (in-service and not reserved):");
            for(Dog dog: dogList) {
                if( dog.getTrainingStatus().equalsIgnoreCase("in-service") && (!dog.getReserved())) {
                    System.out.println("Name: " + dog.getName() + "\nBreed: " + dog.getBreed()
                    + "\nGender: " + dog.getGender() + "\nAge: " + dog.getAge() + "\nWeight: " + dog.getWeight()
                    + "\nAcquisition Date: " + dog.getAcquisitionDate() 
                    + "\nAcquisition Country: " + dog.getAcquisitionLocation() 
                    + "\nReserved: " + dog.getReserved() + "\nTraining Status: " + dog.getTrainingStatus() 
                    + "\nService country: " + dog.getInServiceLocation());
                }
            }
            System.out.println("\n");
            System.out.println("LIST OF AVAILABLE MONKEYS (in-service and not reserved):");
            for(Monkey monkey : monkeyList){
                if(monkey.getTrainingStatus().equalsIgnoreCase("in-service") && (! monkey.getReserved())) {
                    System.out.println("Name: " + monkey.getName() + "\nSpecies: " + monkey.getSpecies()
                    + "\nTails Length: " + monkey.getTailLength() + "\nHeight: "+ monkey.getHeight()
                    + "\nBody Length: " + monkey.getBodyLength() + "\nGender: " + monkey.getGender()
                    + "\nAge: " + monkey.getAge() + "\nWeight: " + monkey.getWeight()
                    + "\nAcquisition Date: " + monkey.getAcquisitionDate() 
                    + "\nAcquisition Country: " + monkey.getAcquisitionLocation()
                    + "\nTraining Status: " + monkey.getTrainingStatus()
                    + "\nReserved: " + monkey.getReserved()
                    + "\nService country: " + monkey.getInServiceLocation());
                }
            }
        }

    }
}

