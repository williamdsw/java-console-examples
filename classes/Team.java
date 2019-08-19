package classes;

/**
 * @author William
 */
public class Team
{
    private String name;
    private int numberOfPoints;
    
    //--------------------------------------------------------------------------------------//
    // CONSTRUCTORS

    public Team (String pName, int pNumberOfPoints)
    {
        this.name = pName;
        this.numberOfPoints = pNumberOfPoints;
    }
    
    //--------------------------------------------------------------------------------------//
    // GETTERS / SETTERS
        
    public String getName ()
    {
        return name;
    }
    
    public void setName (String value)
    {
        this.name = value;
    }

    public int getNumberOfPoints ()
    {
        return numberOfPoints;
    }

    public void setNumberOfPoints (int value)
    {
        this.numberOfPoints = value;
    }
}