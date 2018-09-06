public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(10900000);

    }
    public static void printYearsAndDays(long minutes){


        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else {

            long Hour = minutes/60;
            long Day = Hour/24;
            long Year = Day/365;
            long remainingDays = Day%365;

            System.out.println(minutes + "min = " + Year+ "y "+ "and " + remainingDays +"d" );

        }

        }
    }
