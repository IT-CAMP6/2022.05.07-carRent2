package pl.camp.it.car.rent;

import java.util.*;

public class Main2 {
    /*public static void main(String[] args) {
        String a = "dsfgsdfg(dsfgsdfg)dsfgsdfg(sdfg(Sdfg)s)dfg(sdfg)sdfg)dsfg";

        System.out.println(check(a));

        pl.camp.it.car.rent.databse.DataBase db = pl.camp.it.car.rent.databse.DataBase.getInstance();
        db.getCars();

        pl.camp.it.car.rent.databse.DataBase.getInstance().getCars();
    }

    public static boolean check(String a) {
        int i = 0;
        for(char c : a.toCharArray()) {
            if(c == '(') {
                i++;
            }
            if(c == ')') {
                i--;
            }
            if(i < 0) {
                return false;
            }
        }
        return i == 0;
    }*/

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        if(list instanceof List) {
            a((List<String>) list);
            b((List<String>) list);
            c((List<String>) list);
        }

    }

    static void a(List<String> lista) {

    }

    static void b(List<String> lista) {

    }

    static void c(List<String> lista) {

    }
}
