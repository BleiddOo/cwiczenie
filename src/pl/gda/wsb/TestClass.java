package pl.gda.wsb;

public class TestClass {

    private String imie;
    private String nazwisko;

    public TestClass(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void changeName(String newName){
        setImie(newName);
    }

    public void changeLastName(String newLastName){
        setNazwisko(newLastName);
    }
    @Override
    public String toString() {
        return "TestClass{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                '}';
    }
}
