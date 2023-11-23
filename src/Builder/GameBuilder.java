package Builder;

public class GameBuilder
    implements Builder {

    private String studio;
    private String genre;
    private int numOfEmployees;
    private int numOfPhysicalCopies;
    private String cameraView;

    private Game game;

    public void resetBuilder() {
        this.studio(null)
                .genre(null)
                .numOfEmployees(0)
                .numOfPhysicalCopies(0)
                .cameraView(null);
    }

    public GameBuilder studio(String studio) {
        this.studio = studio;
        return this;
    }

    public GameBuilder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public GameBuilder numOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
        return this;
    }

    public GameBuilder numOfPhysicalCopies(int numOfPhysicalCopies) {
        this.numOfPhysicalCopies = numOfPhysicalCopies;
        return this;
    }

    public GameBuilder cameraView(String cameraView) {
        this.cameraView = cameraView;
        return this;
    }

    public Game build() {
        game = new Game(studio, genre, numOfEmployees, numOfPhysicalCopies, cameraView);
        resetBuilder();
        return game;
    }
}
