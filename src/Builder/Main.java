package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        GameBuilder builder = new GameBuilder();

        director.buildShooterGame(builder);

        System.out.println(builder.build());

        director.buildPlatformerGame(builder);
        builder.studio("Naughty Dog")
                .numOfPhysicalCopies(1200)
                .numOfEmployees(20);

        System.out.println(builder.build());


    }
}
