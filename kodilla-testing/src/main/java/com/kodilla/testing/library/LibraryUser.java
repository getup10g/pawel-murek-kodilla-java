package com.kodilla.testing.library;

public class LibraryUser {
    String fistname;
    String lastname;
    String peselId;

    public LibraryUser(String fistname, String lastname, String peselId) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFistname() {
        return fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "fistname='" + fistname + '\'' +
                ", lastaame='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (!fistname.equals(that.fistname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = fistname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
