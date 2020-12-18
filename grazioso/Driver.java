
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
    	
    	// Instance variables
    	String name;
    	String type;
    	String gender;
    	int age;
    	float weight;
    	String aquisitionDate;
    	String aquisitionSource;
    	String reserved;
   		String trainingLocation;
   		String trainingStart;
   		String trainingEnd;
   		String trainingStatus;
   		
   		Scanner scan = new Scanner (System.in);

    	// Create New Dog
   		
       	Dog dog1 = new Dog();

        
       	// Create New Monkey

        Monkey monkey1 = new Monkey();
    	
        // Method to add animals
      
        System.out.println("Add Animal");
        	
        System.out.println("What is the name of the animal?");
        name = scan.next();
        	
        System.out.println("What type of animal?");
       	type = scan.next();
       	
       	System.out.println("What is the gender?");
       	gender = scan.next();
        	
       	System.out.println("What is the age?");
       	age = scan.nextInt();
        	
       	System.out.println("What is the weight?");
       	weight = scan.nextFloat();
        	
       	System.out.println("Date of acquisition?");
       	aquisitionDate = scan.next();
        	
       	System.out.println("Source of acquisition?");
       	aquisitionSource = scan.next();
        	
       	System.out.println("Is this animal reserved?");
       	reserved = scan.next();
        	
       	System.out.println("What is the training location?");
       	trainingLocation = scan.next();
        	
       	System.out.println("When does the training start?");
       	trainingStart = scan.next();
        	
       	System.out.println("When will the training end?");
       	trainingEnd = scan.next();
        	
       	System.out.println("What is the training status?");
       	trainingStatus = scan.next();

    }
}
