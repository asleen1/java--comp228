public class Singers {
    // Instance variables
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numberOfAlbumsPublished;

    // No-argument constructor
    public Singers() {
        this.singerId = 5;
        this.singerName = "Jimin";
        this.singerAddress = "Busan Korea";
        this.dateOfBirth = "13 Oct. 1995";
        this.numberOfAlbumsPublished = 2;
    }

    // Constructors with various arguments
    public Singers(int singerId) {
        this.singerId = singerId;
    }

    public Singers(int singerId, String singerName) {
        this(singerId);
        this.singerName = singerName;
    }

    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName);
        this.singerAddress = singerAddress;
    }

    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth) {
        this(singerId, singerName, singerAddress);
        this.dateOfBirth = dateOfBirth;
    }

    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth);
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Setters
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Setter for all instance variables
    public void setAllSingerDetails(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Getters
    public int getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }
}
