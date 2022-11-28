package main.entity;

public class Country {
    String region;
    String name;
    String tax;
    String gdp;
    String taxRev;
    String exp;
    String debt;

    public Country(String region, String name, String tax, String gdp, String taxRev, String exp, String debt) {
        this.region = region;
        this.name = name;
        this.tax = tax;
        this.gdp = gdp;
        this.taxRev = taxRev;
        this.exp = exp;
        this.debt = debt;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    public String getTaxRev() {
        return taxRev;
    }

    public void setTaxRev(String taxRev) {
        this.taxRev = taxRev;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "main.entity.Country{" +
                "region='" + region + '\'' +
                ", name='" + name + '\'' +
                ", tax='" + tax + '\'' +
                ", gdp='" + gdp + '\'' +
                ", taxRev='" + taxRev + '\'' +
                ", exp='" + exp + '\'' +
                ", debt='" + debt + '\'' +
                '}';
    }
}
