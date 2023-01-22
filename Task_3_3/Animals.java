package Task_3_3;

import java.util.Random;

public interface Animals {


    String getNickname();
    void getVoice();
}

class Cat implements Animals {
    String nickname;
    Random r = new Random();
    Cat(String nick){
        this.nickname = nick;

    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void getVoice() {
        int t = r.nextInt(3);
        if (t == 0) {
            System.out.println("Мур *бежит*");
        } else if (t == 1) {
            System.out.println("Мяу *не хочет*");
        } else {
            System.out.println("*равнодушно продолжает свои дела*");
        }
    }
}
class Dog implements Animals{
    String nickname;
    Dog(String nickname){
        this.nickname = nickname;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void getVoice() {
        System.out.println("Гав *бежит*");
    }
}


