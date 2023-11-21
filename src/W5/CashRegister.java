
package W5;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double economicalPrice = 2.50;
        if (cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double gourmetPrice = 4.00;
        if (cashGiven >= gourmetPrice) {
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double economicalPrice = 2.50;
        return card.pay(economicalPrice) && ++this.economicalSold >= 0;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4.00;
        return card.pay(gourmetPrice) && ++this.gourmetSold >= 0;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold + " gourmet lunches sold: " + this.gourmetSold;
    }
}
