
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        int monthsToAdd = 0;
        int daysToAdd = 0;
        if (howManyDays / 30 > 0) {
            monthsToAdd = (int) howManyDays / 30;
            int monthsToAddHelper = monthsToAdd;
            while(monthsToAddHelper > 0) {
                if (this.month == 12) {
                    this.year++;
                    this.month = 1;
                } else {
                    this.month++;
                }
                monthsToAddHelper--;
            }
        }
        daysToAdd = howManyDays - (monthsToAdd * 30);
        while(daysToAdd > 0) {
            if (this.day == 30) {
                if (this.month == 12) {
                    this.month = 1;
                    this.year++;
                } else {
                    this.month++;
                }
                this.day = 1;
            } else {
                this.day++;
            }
            daysToAdd--;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate copyOfSimpleDate = new SimpleDate(this.day, this.month, this.year);
        copyOfSimpleDate.advance(days);
        return copyOfSimpleDate;
    }

}
