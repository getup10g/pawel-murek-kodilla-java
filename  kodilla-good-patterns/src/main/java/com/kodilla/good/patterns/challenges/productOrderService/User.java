package com.kodilla.good.patterns.challenges.productOrderService;

public class User {
    private String firstname;
    private String lastname;
    private String adress;
    private String id;

    public User(String firstname, String lastname, String adress, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!firstname.equals(user.firstname)) return false;
        if (!lastname.equals(user.lastname)) return false;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
