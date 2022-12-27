
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }

    public Money minus(Money decreaser) {
        boolean returnZero = false;
        int newEuroAmt = 0;
        if (this.euros - decreaser.euros < 0) {
            returnZero = true;
        }
        newEuroAmt = this.euros - decreaser.euros;
        int newCentsAmt = 0;
        if (this.cents - decreaser.cents < 0) {
            if (newEuroAmt - 1 < 0) {
                returnZero = true;
            }
            newEuroAmt -= 1;
            newCentsAmt = 100 + (this.cents - decreaser.cents);
        } else {
            newCentsAmt = this.cents - decreaser.cents;
        }
        if (returnZero) {
            Money zeroMoney = new Money(0, 0);
            return zeroMoney;
        } else {
            Money newMoney = new Money(newEuroAmt, newCentsAmt);
            return newMoney;
        }
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else return this.euros != compared.euros || this.cents < compared.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
