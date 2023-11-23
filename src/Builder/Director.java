package Builder;

public class Director {
    public void buildPlatformerGame(Builder builder) {
        builder.genre("Platformer")
                .cameraView("2D");
    }

    public void buildShooterGame(Builder builder) {
        builder.genre("Shooter")
                .cameraView("3D");
    }
}
