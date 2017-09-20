public class Game {


    public static void main(String[] args) {
        Machine machine = new Machine();
        Player player2 = new Player("Player-1", 1);
        Player player1 = new Player("Player-2", 1);


        for (int i = 0; i < 1; i++) {
            machine.execute(player1, player2);
        }

        System.out.println("Player 1 has: " + player1.getCoin() + " coins.");
        System.out.println("Player 2 has: " + player2.getCoin() + " coins. ");

    }
}
