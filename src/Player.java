import java.util.Scanner;

public class Player {
    private String name;
    private int coin;

    public Player(String name, int coin) {
        this.name = name;
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public Action getAction() {

        Scanner reader = new Scanner(System.in);
        System.out.println(name +" Enter 1 to co-operate 0 to cheat: ");
        int n = reader.nextInt();
        if (n == 1) {
            return Action.COOPERATE;
        } else {
            return Action.CHEAT;
        }
    }

    public void update(int delta) {
        coin += delta;
    }
}
