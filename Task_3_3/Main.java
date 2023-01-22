package Task_3_3;



public class Main {
    public static void main(String[] args) {
        Human h = new Human("Игорь");
        Animals d = new Dog("Мухтар");
        Animals c = new Cat("Барсик");
        System.out.printf("%s зовет %sа и %s кушать: ",h.name, c.getNickname(),d.getNickname());
        h.getAction();
        c.getVoice();
        d.getVoice();

    }




}
