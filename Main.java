package JavaBasics2;
import java.util.*;
public class Main {
    public static void main(String[] args){
        var sports = new ArrayList<Sport>();

        var basketball = new Basketball();
        var football = new Football();
        var soccer = new Soccer();

        sports.add(basketball);
        sports.add(football);
        sports.add(soccer);

        for (Sport s : sports){
            System.out.println(s.play());
        }
    }
}
