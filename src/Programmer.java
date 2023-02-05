public class Programmer {
    private String name;
    private String company;
    private String[] positionLevel = {"intern", "junior", "middle", "senior", "lead"};
    private int positionNumber;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.positionNumber = 0;
    }

    public String getPosition() {
        return positionLevel[positionNumber];
    }

    public void work() {
        positionNumber = positionNumber < 4 ? positionNumber + 1 : positionNumber;
    }
}
