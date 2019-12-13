public class KingdomCheck {

    public static void main(String [] args) {
        MughalKindgom akbar = new MughalKindgom();
        MarathaKingdom bajirao = new MarathaKingdom();

        if(akbar instanceof Kingdom){
            System.out.println("\nMughal battle Cry");
            akbar.battleCry();
        }

        if(bajirao instanceof MarathaKingdom) {
            System.out.println("\nMaratha battle Cry");
            bajirao.battleCry();
        }

    }


}
