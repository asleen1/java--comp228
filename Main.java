public class Main {
    public static void main(String[] args) {
        // Create a Singer object using the no-argument constructor
        Singers singer1 = new Singers();

        // Display the default values
        System.out.println("Default Singer Details:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());

        // Set the values using setters
        singer1.setAllSingerDetails(1, "Lalisa Manobal", "Thailand", "Mar 27, 1997", 1);

        // Display the updated values
        System.out.println("\nUpdated Singer Details:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());
    }
}
