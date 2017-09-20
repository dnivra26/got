public class Machine {

    public Machine() {
    }

    public void execute(Player player1, Player player2) {
        Action player1Action = player1.getAction();
        Action player2Action = player2.getAction();
        player1.update(getRewardForAction(player2Action) - getContributionForAction(player1Action));
        player2.update(getRewardForAction(player1Action) - getContributionForAction(player2Action));
    }

    private int getRewardForAction(Action action) {
        if (action.equals(Action.COOPERATE)) {
            return 3;
        } else {
            return 0;
        }
    }

    private int getContributionForAction(Action action) {
        if (action.equals(Action.COOPERATE)) {
            return 1;
        } else {
            return 0;
        }
    }
}
