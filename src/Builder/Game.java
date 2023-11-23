package Builder;

public class Game {
    private String studio;
    private String genre;
    private int numOfEmployees;
    private int numOfPhysicalCopies;
    private String cameraView;

    Game() { }
    Game (String studio, String genre, int numOfEmployees, int numOfPhysicalCopies, String cameraView) {
        this.studio = studio;
        this.genre = genre;
        this.numOfEmployees = numOfEmployees;
        this.numOfPhysicalCopies = numOfPhysicalCopies;
        this.cameraView = cameraView;
    }

    @Override
    public String toString() {
        return "Studio: " + studio + "\n" +
                "Genre: " + genre + "\n" +
                "Number of Employees: " + numOfEmployees + "\n" +
                "Number of Physical copies: " + numOfPhysicalCopies + "\n" +
                "Camera view: " + cameraView + "\n";
    }
}
