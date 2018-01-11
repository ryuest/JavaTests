package Arrays;

/**
 * Created by jboiko on 11/01/2018.
 */
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class SmartPhone {

    String brand;
    String model;
    int price;
    int rating;
    SmartPhone(String brand,String model,int price, int rating){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rating = rating;

    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString() {
        return"SmartPhone [brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + "]";
    }
    public int compareTo(SmartPhone sp) {
        return this.price - sp.price;

    }
}
class RatingComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone obj1, SmartPhone obj2) {
        return (obj1.rating<obj2.rating) ? -1 : (obj1.rating>obj2.rating) ? 1 : 0;
    }
}

public class ArrayListDescendingOrder {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<SmartPhone> phoneList = new ArrayList<>();
        SmartPhone ph1 = new SmartPhone("Apple", "6s", 50000, 10);
        SmartPhone ph2 = new SmartPhone("lg", "pro2", 40000, 9);
        SmartPhone ph3 = new SmartPhone("MI", "3s", 10000, 6);
        SmartPhone ph4 = new SmartPhone("Letv", "le2", 12000, 7);

        phoneList.add(ph1);
        phoneList.add(ph2);
        phoneList.add(ph3);
        phoneList.add(ph4);
        System.out.println("Actual List");
        System.out.println(phoneList);
        System.out.println("Sorting the list as comparator");
        Collections.sort(phoneList, new RatingComparator());

        System.out.println(phoneList);
        System.out.println("Reversing the Comparator sorting");
        Comparator<SmartPhone> cmp = Collections.reverseOrder(new RatingComparator());

        Collections.sort(phoneList, cmp);
        System.out.println("Printing the reverse list");
        System.out.println(phoneList);
    }

}
