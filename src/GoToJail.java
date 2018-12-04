public class GoToJail extends Block{
    private int jail_visit_index;
    private int waiting_time;
    private int penaltyMoney;

    public GoToJail(int index, String name) {
        super(index, name);
        this.waiting_time=3;
        this.penaltyMoney=100;
    }

    @Override
    public boolean playTurn(Player player){ //TODO unit test
        super.printBlock(player);
        player.setWaiting_time(waiting_time);
        player.decreaseMoney(penaltyMoney);
        System.out.println(player.getName() + " have to pay penalty money: " + penaltyMoney + "\n Now " + player.getName()
                + " has " + player.getMoney() + " money.");
        System.out.println("player's position: " +player.getPosition());
        //send player to mapushane
        player.setPosition(10);
        return true;
    }

    public int getJail_visit_index() {
        return jail_visit_index;
    }

    public void setJail_visit_index(int jail_visit_index) {
        this.jail_visit_index = jail_visit_index;
    }

    public int getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }
}
