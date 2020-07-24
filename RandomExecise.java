import Array.Array;

import java.util.ArrayList;
import java.util.Random;
public class RandomExecise {
    public static void main(String[] args) {
        ArrayList<Instrument> list = new ArrayList<>();
        Instrument piano =new Piano();
        Instrument flute =new Flute();
        Instrument guitar=new Guitar();
        Random random = new Random();
        for (int i = 0; i<10;i++){
            int RandomNumber = random.nextInt( 3);
            if (RandomNumber==1) {
                list.add(piano);
            }
            else if ( RandomNumber==2){
                list.add(flute);
            }
            else {
                list.add(guitar);
            }
        }
        for (int a =0; a < list.size();a++){
            if (list.get(a) instanceof Piano){
                piano.play();
            }
            else if (list.get(a)instanceof Flute) {
                flute.play();
            }
            else {
                guitar.play();
                guitar.play();
            }

        }
    }
}
abstract class Instrument{
    abstract void play();
}
class Piano extends Instrument{

    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan");

    }
}
class Flute extends Instrument{

    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot");

    }
}
class Guitar extends Instrument{

    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");

    }
}
