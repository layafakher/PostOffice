package ir.ac.kntu;

import java.util.Objects;

public class Costumer {
    private String name;
    private String nationalCode;

    public Costumer(String name, String nationalCode) {
        this.name = name;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Costumer costumer = (Costumer) o;
        return name.equals(costumer.name) &&
                nationalCode.equals(costumer.nationalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationalCode);
    }
}
