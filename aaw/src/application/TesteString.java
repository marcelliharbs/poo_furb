package application;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteString {
    public static void main(String[] args) {

        String time1 = "Vasco da Gama", time2 = "Botafogo", time3 = "São Paulo", time4 = "Palmeiras", time5 = "Flamengo",
                time6 = "Coritiba", time7 = "Santos", time8 = "Internacional", time9 = "Grêmio", time10 = "Cruzeiro";

        ArrayList<String> times = new ArrayList<>();

        times.add(time1);
        times.add(time2);
        times.add(time3);
        times.add(time4);
        times.add(time5);
        times.add(time6);
        times.add(time7);
        times.add(time8);
        times.add(time9);
        times.add(time10);

        times.remove(6);

        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }
    }
}
