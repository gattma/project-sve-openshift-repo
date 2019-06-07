package at.fh.sve.ue04.ms.domain;

public class Address {

    private Long postalCode;
    private String city;
    private String street;

    public Address() {
        super();
    }

    public Address(Long postalCode, String city, String street) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
