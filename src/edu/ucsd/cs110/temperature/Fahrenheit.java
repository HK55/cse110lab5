package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float result = (float) ((this.getValue() - 32) * 5/9);
        return new Celsius(result);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        String v = String.valueOf(this.getValue()) + " F";
        return v ;
    }
}
