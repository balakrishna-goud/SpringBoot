record Address(String name,String city, String country) {
    public Address {
        if (city == null || city.isBlank())
            throw new IllegalArgumentException("City cannot be empty");
    }
}