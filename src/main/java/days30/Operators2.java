package days30;

public class Operators2 {

    public static void main(String[] args) {

        Double meal = 10.25;
        int tip = 17;
        int tax = 5;

        double total = meal + (meal * (tip/(double)100)) + (meal * (tax/(double)100));

        System.out.println((int) Math.round(total));

    }

}
