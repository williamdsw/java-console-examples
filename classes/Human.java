package classes;

/**
 * @author William
 */
public class Human implements Animal
{
    /* Properties */
    private String firstName;
    private String lastName;
    private String species;
    private Integer age;
    private Double height;
    private Double weight;
    
    /* Construtor */
    public Human () {}

    /* Getters / Setters */
    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String value)
    {
        this.firstName = value;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String value)
    {
        this.lastName = value;
    }

    @Override
    public String getSpecies ()
    {
        return species;
    }

    @Override
    public void setSpecies (String value)
    {
        this.species = value;
    }

    @Override
    public Integer getAge ()
    {
        return age;
    }

    @Override
    public void setAge (Integer value)
    {
        this.age = value;
    }

    @Override
    public Double getHeight ()
    {
        return height;
    }

    @Override
    public void setHeight (Double value)
    {
        this.height = value;
    }

    @Override
    public Double getWeight ()
    {
        return weight;
    }

    @Override
    public void setWeight (Double value)
    {
        this.weight = value;
    }
    
    public String getFullName ()
    {
        return this.firstName + " " + this.lastName;
    }
}