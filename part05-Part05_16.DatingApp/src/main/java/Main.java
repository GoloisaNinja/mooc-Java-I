
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(28, 12, 2022);
        //SimpleDate date2 = new SimpleDate(14, 3, 2010);

//        date1.advance(709);
//        System.out.println(date1);
        SimpleDate newDate = date1.afterNumberOfDays(709);
        System.out.println(newDate);

    }
}
