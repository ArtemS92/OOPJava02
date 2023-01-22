package Task_3_1;

import java.util.ArrayList;

public abstract class Human {
    int id;
    String fn;
    String ln;

    ArrayList<Human> childs = new ArrayList<>();
    Human mom;
    Human dad;
}
class Dad extends Human{

}
class Mom extends Human{

}
class Child extends Human{

}