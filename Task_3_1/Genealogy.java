package Task_3_1;

import java.util.ArrayList;

public class Genealogy {

    public static void main(String[] args) {
        //отец h12
        Human h1 = new Dad();
        h1.id = 1;
        h1.fn = "Игорь";
        h1.ln = "Петров";

        //сын от h1
        Human h12 = new Child();
        h12.id = 2;
        h12.fn = "Саша";
        h12.ln = "Петров";

        //сын от h1
        Human h13 = new Child();
        h13.id = 5;
        h13.fn = "Максим";
        h13.ln = "Петров";

        //мама h12
        Human h3 = new Mom();
        h3.id = 3;
        h3.fn = "Света";
        h3.ln = "Иванова";

        //внук от h1 (сын h12)
        Human h22 = new Child();
        h22.id = 4;
        h22.fn = "Петя";
        h22.ln = "Петров";

        //родители
        h13.dad = h1;
        h13.mom = h3;
        h22.dad = h13;

        //дети
        h1.childs.add(h12);
        h3.childs.add(h12);
        h1.childs.add(h13);
        h3.childs.add(h13);

        h12.childs.add(h22);

        //Iterr.ViewForward(h22, "");
        StringBuilder sb = new StringBuilder();
        String str = "";
        Iterr i = new It();
        i.ViewReverse(h1, sb, str);
        System.out.println(sb);
    }
}

