
package W5;

public class Main {
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();

        System.out.println(unicafeExactum);

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(2);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("money on the card " + cardOfJim.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
