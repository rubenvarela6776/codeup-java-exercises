package objectOrientation;

/**
 * Created by rubenvarela on 1/17/17.
 */
public class TestObjectOrientation {
    private String firstName;
    private String lastName;
    private int testScore;

    public TestObjectOrientation(String firstName, String lastName, int testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScore = testScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}
