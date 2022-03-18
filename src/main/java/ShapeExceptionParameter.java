public class ShapeExceptionParameter {
    private final int numberOfSides;
    private static String description;

    public ShapeExceptionParameter(int numberOfSides, String description)
    {
        if (numberOfSides < 3 || numberOfSides == Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException();
        }
        this.numberOfSides = numberOfSides;
        this.description = description;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public static String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
