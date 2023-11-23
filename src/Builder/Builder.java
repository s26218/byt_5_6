package Builder;

public interface Builder {
    void resetBuilder();
    Builder studio(String studio);
    Builder genre(String genre);
    Builder numOfEmployees(int numOfEmployees);
    Builder numOfPhysicalCopies(int numOfPhysicalCopies);
    Builder cameraView(String cameraView);
}
