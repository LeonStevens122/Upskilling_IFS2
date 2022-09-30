public class IQ {
    public static void main(String[] args) {

        // Create array of integers that stores 5 test results.
        int[] testResults = {150, 78, 133, 116, 78};

        // create variables to store the total of all the scores and the average

        double averageIQ = 0;
        double scoresTotal = 0;

        // For loop iterates through all the elements in the array and ads them to
        // the scoresTotal variable, getting a total of all the scores added together.
        for (int i = 0; i < testResults.length; i++)
        {
            scoresTotal += testResults[i];
        }

        //calculate the average
        averageIQ =  (scoresTotal / testResults.length);

        // a very long very ugly set of If statements to check where the average falls in the ranges given
        // Java Switch statements do not allow for a range of integers and does not allow for double or Float at all
        if (averageIQ >= 130)
        {
              System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
              System.out.println("These individuals would qualify as Very superior");
        }
        else if ((averageIQ >= 120) && (averageIQ <= 129))
        {
              System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
              System.out.println("These individuals would qualify as Superior");
        }
        else if ( (averageIQ >= 110) && (averageIQ <= 119))
        {
            System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
            System.out.println("These individuals would qualify as High average");
        }
        else if ((averageIQ >= 90) && (averageIQ <= 109))
        {
            System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
            System.out.println("These individuals would qualify as Average");
        } else if ((averageIQ >= 80) && (averageIQ <= 89))
        {
            System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
            System.out.println("These individuals would qualify as Low Average");
        }
        else if ((averageIQ >= 70) && (averageIQ <= 79))
        {
            System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
            System.out.println("These individuals would qualify as Borderline");
        }
        else
        {
            System.out.println("The average IQ of the scores submitted is " + averageIQ + '\n');
            System.out.println("These individuals would qualify as Extremely Low");
        }

        }

    }

