package BraAttHaKod.TCP.ClientServerSkickarSträngar;

public class Person {

    protected String namn;
    protected String adress;
    protected String mobilnummer;
    protected String födelsedag;

    public Person(String namn, String adress, String mobilnummer, String födelsedag) {
        this.namn = namn;
        this.adress = adress;
        this.mobilnummer = mobilnummer;
        this.födelsedag = födelsedag;
    }

    @Override
    public String toString() {
        return namn+", "+adress+", "+mobilnummer+", "+födelsedag;
    }
}
