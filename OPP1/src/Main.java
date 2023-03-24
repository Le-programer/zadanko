import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Napoje> picia = new ArrayList<Napoje>();
        picia.add(new Cola());
        picia.add(new Fanta());
        picia.add(new Liptun());
        for (Napoje picie:picia) {
            picie.pij();
        }
        Function<String, Integer> len = (str) -> {return str.length();};
        System.out.println(len.apply("Test tekst"));
        Consumer<Integer> ocen = (jaka) -> {System.out.printf("Dostane ocene: %d \n", jaka);};
        ocen.accept(4);
        IntBinaryOperator go = (a,b) -> {return a*b;};
        System.out.println(go.applyAsInt(5, 7));
    }
}