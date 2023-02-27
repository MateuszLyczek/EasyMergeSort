package easymergesort;
import static easymergesort.EasyMergeSort.jakSortowac;

public class Student {
    private final String imie, nazwisko, kierunek;
    private final int wiek;
    Student (String imie, String nazwisko,  String kierunek, int wiek ){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.wiek = wiek;
    }
    
    @Override
    public String toString() { 
        String sImie = String.format("%-10s %-12s %-5s %s", this.imie, this.nazwisko, this.wiek, this.kierunek); 
        String sNazwisko = String.format("%-12s %-10s %-5s %s", this.nazwisko, this.imie, wiek, this.kierunek); 
        String sKierunek = String.format("%-15s %-10s %-12s %s", this.kierunek, this.imie, this.nazwisko, this.wiek); 
        String sWiek = String.format("%-5s %-10s %-12s %s", this.wiek, this.imie, this.nazwisko, this.kierunek); 
        switch(jakSortowac){
            case 1: 
                return sImie;
            case 2: 
                return sNazwisko;
            case 3: 
                return sKierunek;
            case 4: 
                return sWiek;
            default: 
                return sImie;
        }
    } 
}
