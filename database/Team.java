package database;

import java.sql.Timestamp;

/**
 * @author William
 */
public class Team
{
    private Integer ID;
    private String name;
    private String city;
    private String country;
    private Integer yearFoundation;
    private String stadium;
    private Timestamp lastChanged;

    public Team () {}

    public Integer getID ()
    {
        return ID;
    }

    public void setID (Integer value)
    {
        this.ID = value;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String value)
    {
        this.name = value;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String value)
    {
        this.city = value;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String value)
    {
        this.country = value;
    }

    public Integer getYearFoundation ()
    {
        return yearFoundation;
    }

    public void setYearFoundation (Integer value)
    {
        this.yearFoundation = value;
    }
    
    public String getStadium ()
    {
        return stadium;
    }

    public void setStadium (String value)
    {
        this.stadium = value;
    }

    public Timestamp getLastChanged ()
    {
        return lastChanged;
    }

    public void setLastChanged (Timestamp value)
    {
        this.lastChanged = value;
    }
}