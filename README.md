# Java_Pet_Rescue
Competencies
In this project, you will demonstrate your mastery of the following competencies:
Implement appropriate language constructs for an object-oriented programming language
Write programs using object-oriented conventi ons in accordance with industry standard best practi ces
Scenario
You work for Global Rain, a soft ware engineering company that specializes in custom soft ware design and development. As a junior
soft ware developer, you are part of a soft ware development team at Global Rain that collaborates to create soft ware soluti ons for
entrepreneurs, businesses, and government agencies around the world.
You have been newly assigned to a development team at Global Rain. This team is currently working on a project for an innovati ve
internati onal search and rescue animal training company, Grazioso Salvare. Grazioso Salvare is seeking a soft ware applicati on that
will help track search and rescue animals, someti mes referred to as rescue animals. These rescue animals are obtained and trained by
the company to rescue humans from diffi cult (or even life-threatening) situati ons.
A porti on of the work on this project has already been done. Your team lead has assigned you to create one new class and modify
the existi ng driver class in the soft ware applicati on. You will deliver all the class fi les to the team lead, who will consolidate them
with the work from other team members and present the applicati on to your client.
Directi ons
Your team lead has given you a specifi cati on document detailing Grazioso Salvare’s soft ware needs. Other members of the Global
Rain development team have already started creati ng the RescueAnimal.java, Dog.java, and Driver.java class fi les. Your team lead has
asked you to modify the existi ng Driver.java class and create a Monkey.java class as your contributi on to the team.
Required Pre-work
1. To gain a clear understanding of the client’s requirements, review the Grazioso Salvare Specifi cati on Document, located in
the Supporti ng Materials secti on. As you read, pay close att enti on to the att ributes and methods that you will need to
implement into the program.
2. Open the Virtual Lab by clicking on the link in the Virtual Lab Access module. Then open the Eclipse IDE. Follow the
Uploading Files to Eclipse Tutorial to upload the Grazioso.zip fi les into Eclipse. Both the tutorial and the zipped folder are
located in the Supporti ng Materials secti on. The Grazioso.zip folder contains three class fi les. Once you upload the fi les,
compile the code. Although the program is not complete, it should compile without error.
3. Read through the code for each class that you have been given. This will help you understand what code has been created
and what code must be modifi ed or created to meet the requirements.
Once you have completed the pre-work, you are ready to begin your assigned tasks.
Monkey.java Class
1. Your team lead reminded you to demonstrate industry standard best practi ces in all of your code to ensure clarity,
consistency, and effi ciency among all soft ware developers working on the program. In your code for each class, be sure to
include the following:
In-line comments that denote your changes and briefl y describe the functi onality of each method or element of the
class
Appropriate variable and method naming conventi ons
2. In a new Java fi le, create the Monkey class, using the specifi cati on document as a guide. The Monkey class must do the
following:
Inherit from the RescueAnimal class
Implement all att ributes to meet the specifi cati ons
Include a constructor. You may use a default constructor. To score “exemplary” on this criterion, you must include
the more detailed constructor that initi alizes values for all att ributes. Refer to the constructor in the Dog class for an
example.
Include accessors and mutators for all implemented att ributes
Driver.java Class
In this class, you will modify and implement several diff erent methods. You will need to refer back to the code from the other classes
to properly implement these methods.
1. As a reminder, you must demonstrate industry standard best practi ces, such as in-line comments to denote changes and
describe functi onality and appropriate naming conventi ons throughout the code that you create or modify for this class.
2. First, you will modify the main() method. In main(), you must create a menu loop that does the following:
Displays the menu by calling the displayMenu() method. This method is in the Driver.java class.
Prompts the user for input
Includes input validati on. If the user inputs a value not on the menu, the program should print an error message.
Takes the appropriate acti on based on the value that the user entered.
IMPORTANT: In the Module Five milestone, you were asked to create a menu loop but were not required to include input
validati on. Be sure to include input validati on for your Project Two submission.
3. Next, you will complete the intakeNewDog() method. Your completed method should do the following:
Prompt the user for input
Include input validati on. Note: The required input validati on has already been included in the starter code; be sure to
review it.
Set data for all att ributes based on user input
Add the newly instanti ated dog to an ArrayList
Hint: Remember to refer to the accessors and mutators in the Dog and RescueAnimal classes as you create this method.
4. Next, you will implement the intakeNewMonkey() method. Before you do this, you will need to create a monkey ArrayList in
the Driver.java class. Refer to the dog ArrayList for an example. Then, begin implementi ng the intakeNewMonkey() method.
Your completed method should do the following:
Prompt the user for input
Include input validati on for the monkey’s name and species type. If the user enters an invalid opti on, the program
should print an error message.
Set data for all att ributes based on user input
Add the newly instanti ated monkey to an ArrayList
Hint: Remember to refer to the accessors and mutators in your Monkey and RescueAnimal classes as you create this
method.
IMPORTANT: In the Module Five milestone, you began implementi ng this method but were not required to include input
validati on. Be sure to include input validati on for your Project Two submission.
5. Next, you will implement the reserveAnimal() method. Your completed method should do the following:
Prompt the user for input. The user should enter their desired animal type and country.
If there is an available animal which meets the user’s input criteria, the method should access an animal object from
an ArrayList. If there are multi ple animals that meet these criteria, the program should access the fi rst animal in the
ArrayList. The method should also update the “reserved” att ribute of the accessed animal.
If there is not an available animal which meets the user’s input criteria, the method should output feedback to the
user letti ng them know that no animals of that type and locati on are available.
6. Finally, you have been asked to implement a printAnimals() method that provides easy-to-read output displaying the details
of objects in an ArrayList.
To demonstrate this criterion in a “profi cient” way, your implemented method must successfully print the ArrayList of
dogs or the ArrayList of monkeys.
To demonstrate this criterion in an “exemplary” way, your implemented method must successfully print a list of all
animals that are “in service” and “available”.
