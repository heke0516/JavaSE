package TEST;

public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }
}
