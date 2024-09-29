package P0052;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.totalArea = totalArea;
    }

    public Country() {
    }

    ;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public void display() {
        System.out.println(countryCode + " " + countryName + " " + totalArea);
    }

}
