public class SciFiName {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses be at least three characters long.");
        System.out.println("For best results, capitalize every word and do not use any spaces.\n");

        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your elementary school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        System.out.print("Hi, ");
        String First = firstName.substring(0,3) + lastName.substring(1,4);
        System.out.print(First);
        System.out.print(" ");
        String Last = city.substring(0,3) + school.substring(2,5) +  firstName.substring(1,3);
        System.out.print(Last);
        System.out.print(" from planet ");
        String Planet = relativeName1.substring(0,2) + city.substring(2,5) + relativeName2.substring(1,4);
        System.out.print(Planet);
        System.out.println(" in the ");
        String Galaxy = school.substring(0,4) + relativeName2.substring(2,4) + lastName.substring(1,3) + city.substring(2,5);
        System.out.print(Galaxy);
        System.out.print(" galaxy");
        System.out.print(".");
        System.out.print(" Nice to meet you.");


    }
}