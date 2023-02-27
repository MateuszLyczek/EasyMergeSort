package easymergesort;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import easymergesort.Student;


public class EasyMergeSort {
    public static List<Student> osoby = new ArrayList<>();
    public static int jakSortowac;
    
    public static void main(String[] args){  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("W jaki sposób chcesz posortować listę? \n  1. Imię\n  2. Nazwisko\n  3. Kierunek studiów\n  4. wiek");
        jakSortowac = sc.nextInt();
        osoby.add(new Student("Patryk", "Kamiński", "Informatyka", 19));
        osoby.add(new Student("Kamil", "Banaś","Geografia",25));
        osoby.add(new Student("Zenon", "Gudz","Historia",21));
        osoby.add(new Student("Adam", "Patyn","Biologia",22));
        osoby.add(new Student("Kamila", "Nowak","Pielęgniarstwo",19));
        osoby.add(new Student("Anna", "Kowalik","Geografia",25));

        if(jakSortowac == 1)System.out.println("Wybrałeś opcję nr. 1 - Sortowanie po imieniu:\n"+
                "   Imie       Nazwisko    Wiek   Kierunek ");
        if(jakSortowac == 2)System.out.println("Wybrałeś opcję nr. 2 - Sortowanie po nazwisku:\n"+
                "   Nazwisko     Imie      Wiek   Kierunek ");
        if(jakSortowac == 3)System.out.println("Wybrałeś opcję nr. 3 - Sortowanie po kierunku:\n"+
                "   Kierunek        Imie       Nazwisko    Wiek ");
        if(jakSortowac == 4)System.out.println("Wybrałeś opcję nr. 4 - Sortowanie po wieku:\n"+
                "  Wiek   Imie       Nazwisko     Kierunek");
        if(jakSortowac > 4 || jakSortowac < 1)System.out.println("Wybrana opcja nie istnieje, domyślne sortowanie po imieniu:");
        System.out.println("---------------------------------------------------");
        Sortowanie sortowanie = new Sortowanie(osoby);
        sortowanie.sortuj();
        sortowanie.pokaz();
        System.out.println("---------------------------------------------------");
                
    }
}
