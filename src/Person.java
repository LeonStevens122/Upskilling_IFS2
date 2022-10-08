// L2T06
// Create Person Class
// Extend person class to Doctor & Scientist

import java.util.Map;

// Create Person Class
public class Person
{
    // set parameters for the person class
    int height;
    String hair;
    boolean eighteen_or_older;

    // Constructor method for Person Object
    public Person(int height, String hair, boolean eighteen_or_older )
    {
        this.height = height;
        this.hair = hair;
        this.eighteen_or_older = eighteen_or_older;

    }

    // Create Doctor Class
    public static class Doctor extends Person
    {
        // Constructor method for the Doctor sub class
        public Doctor(int height, String hair, boolean eighteen_or_older, int yearsExperince)
        {
            super(height, hair, eighteen_or_older);
            this.yearsExperince = yearsExperince;
            this.ranking = getRanking(yearsExperince);


        }
        int yearsExperince;
        String ranking = getRanking(yearsExperince);

        // Method in the Doctor class to get the Ranking based on the Years Experience
        public static String getRanking(int expYears)
        {
            if (expYears <= 6)
            {
                return "Medical student";
            }
            else if (expYears >= 7 && expYears <= 8)
            {
                return "Intern";
            }
            else if (expYears >= 9 && expYears <= 16)
            {
                return "Resident";
            }
            else if (expYears >= 17 && expYears <= 20)
            {
                return "Fellow";
            } else
            {
                return "Attending";
            }

        }

        // Method to print the Doctor Object
        private void printDoctor()
        {
            System.out.println("\nThe Doctor's height  is : " + this.height);
            System.out.println("The Doctor's Hair Color  is : " + this.hair);
            System.out.println("The Doctor's Years Experience  is : " + this.yearsExperince);
            System.out.println("The Doctor's Ranking   is : " + this.ranking);

        }

    }
    // Create Scientist Subclass
    public static class Scientist extends Person
    {
        String labCoatColor;
        String typeOfScientist;

        // Method to print the Scientist class Object
        private void printScientist()
        {
            System.out.println("\nThe Scientist's height  is : " + this.height);
            System.out.println("The Scientist's Hair Color  is : " + this.hair);
            System.out.println("The Scientist's LobCoat Coloe  is : " + this.labCoatColor);
            System.out.println("The Scientist's Speciality is : " + this.typeOfScientist);

        }

        // Constructor method for the Scientist subclass
        public Scientist(int height, String hair, boolean eighteen_or_older, String labCoatColor)
        {
            super(height, hair, eighteen_or_older);

            // Use a HAshMap to determine the type of scientist based on the lab coat color
            Map<String, String> scientistType = Map.of(
                    "Green", "Biologist",
                    "White", "Pharmacist",
                    "Blue", "Climatologist",
                    "Yellow", "Geneticist",
                    "Red", "Zoologist"
            );

            this.labCoatColor = labCoatColor;
            this.typeOfScientist = scientistType.get(labCoatColor);
        }

    }

    // Main class runs the program
    public static void main(String[] args)
    {
        // Generate a new Scientist
        Scientist bob = new Scientist((int) 1.85, "Blonde", true, "Green");
        // use the PrintScientist method to print the scientist details
        bob.printScientist();

        // Create a new Doctor Object
        Doctor duke = new Doctor((int) 1.8, "Brunette", true, 18 );
        // Use the printDoctor Method to print out the details of the Doctor Object.
        duke.printDoctor();

    }


}

