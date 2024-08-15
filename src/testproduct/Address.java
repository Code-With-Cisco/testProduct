package testproduct;


public class Address 
{
    
// instance variables
    private String street, city, state, zip;

// parameterized constructor
    public Address(String st)
    {
        state = st;
    }

// to get the state name
    public String getState()
    {
        return state;
    }

 
}
