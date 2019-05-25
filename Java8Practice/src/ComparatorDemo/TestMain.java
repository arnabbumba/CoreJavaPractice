package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		List<Laptop> list = new ArrayList<>();
		
		list.add(new Laptop("Apple", 18000, 16));
		list.add(new Laptop("Apple", 1000, 12));
		list.add(new Laptop("xaiomi", 6000, 10));
		System.out.println(list);
		order(list);
		System.out.println(list);
	}


@SuppressWarnings({ "unchecked", "rawtypes" })
private static void order(List<Laptop> lap) {

    Collections.sort(lap, new Comparator() {

        public int compare(Object o1, Object o2) {

            String x1 = ((Laptop) o1).getBrand();
            String x2 = ((Laptop) o2).getBrand();
            int sComp = x1.compareTo(x2);

            if (sComp != 0) {
               return sComp;
            } 

            Integer y1 = ((Laptop) o1).getRam();
            Integer y2 = ((Laptop) o2).getRam();
            return y1.compareTo(y2);
    }});
}
}
