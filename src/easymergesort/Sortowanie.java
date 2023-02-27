package easymergesort;

import java.util.ArrayList;
import java.util.List;
import easymergesort.Student;
public class Sortowanie {
 
    private List lista;
    public  Sortowanie(List<Student> wejscie) {
        lista = wejscie;
    }
     
    public void sortuj() {
        lista = sortowanie(lista);
    }
 
    List<Student> sortowanie(List<Student> calosc) {
        List<Student> lewa = new ArrayList<>();
        List<Student> prawa = new ArrayList<>();
        int srodek;
 
        if (calosc.size() == 1) {    
            return calosc;
        } else {
            srodek = calosc.size()/2;
            for (int i=0; i<srodek; i++) {
                    lewa.add(calosc.get(i));
            }
 
            for (int i=srodek; i<calosc.size(); i++) {
                    prawa.add(calosc.get(i));
            }

            lewa  = sortowanie(lewa);
            prawa = sortowanie(prawa);

            polacz(lewa, prawa, calosc);
        }
        return calosc;
    }
 
    private void polacz(List<Student> lewa, List<Student> prawa, List<Student> calosc) {
        int lewaId = 0;
        int prawaId = 0;
        int caloscId = 0;
        while (lewaId < lewa.size() && prawaId < prawa.size()) {
            if ( String.valueOf(lewa.get(lewaId)).compareTo(String.valueOf(prawa.get(prawaId))) < 0) {
                calosc.set(caloscId, lewa.get(lewaId));
                lewaId++;
            } else {
                calosc.set(caloscId, prawa.get(prawaId));
                prawaId++;
            }
            caloscId++;
        }
 
        List<Student> reszta;
        int resztaId;
        if (lewaId >= lewa.size()) {
            reszta = prawa;
            resztaId = prawaId;
        } else {
            reszta = lewa;
            resztaId = lewaId;
        }
 
        for (int i=resztaId; i<reszta.size(); i++) {
            calosc.set(caloscId, reszta.get(i));
            caloscId++;
        }
    }
 
    public void pokaz() {
        for (int i=0; i< lista.size();i++) {
            System.out.println((i+1)+". "+lista.get(i));
        }
    }

}