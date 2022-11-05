package weeks;

public class FootballClub {
    private double balance;
    private String clubName;
    private double ticketFee;
    private String stadiumName;
    private int stadiumCapacity;
    private Player[] players;

    private static int playerSize = 0;

    private static int soldTicket = 0;

    public FootballClub() {
        this(40_000_000, "default", 0, "default", 0, new Player[25]);
    }

    public FootballClub(double balance, String clubName, double ticketFee, String stadiumName,
                        int stadiumCapacity) {
        this(balance, clubName, ticketFee, stadiumName, stadiumCapacity, new Player[25]);
    }

    public FootballClub(double balance, String clubName, double ticketFee, String stadiumName,
                        int stadiumCapacity, Player[] players) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
        this.players = players;
    }

    public double getBalance() {
        return balance;
    }

    public double getTicketFee() {
        return ticketFee;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public String getClubName() {
        return clubName;
    }

    public static int getSoldTicket() {
        return soldTicket;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public void sellTicket(int numberOfTickets) {
        if (getSoldTicket() + numberOfTickets >= getStadiumCapacity()) {
            System.out.println("Your capacity is full! Cannot sell more/that amount of tickets.");
            return;
        }
        setBalance(getBalance() + (getTicketFee() * numberOfTickets));
        soldTicket += numberOfTickets;
    }

    public void sellPlayer(Player p) {
        if (doThatPlayerExist(p)) {
            setBalance(getBalance() + p.getFee());
            removePlayer(p);
            System.out.println("You sold " + p.getName().toUpperCase());
            printBalance();
        } else
            System.out.println("That player doesn't exist.");
    }

    private void printBalance() {
        System.out.println("BALANCE :" + this.balance);
        System.out.println("--------");
    }


    private boolean doThatPlayerExist(Player p) {
        for (int i = 0; i < playerSize; i++) {
            if (players[i].getName().equals(p.getName())) {
                return true;
            }
        }
        return false;
    }

    public void buyPlayer(Player p) {
        if (playerSize < players.length) {
            if (p.getFee() < balance)
                setBalance(getBalance() - p.getFee());
            else
                System.out.println("You don't have that much money.");
        } else {
            System.out.println("Your capacity is full!");
        }
    }

    private void addPlayer(Player p) {
        if (playerSize < players.length)
            players[playerSize++] = p;
    }

    private void removePlayer(Player p) {
        int index = findPLayer(p);
        if (index == -1) {
            System.out.println("There isn't any player like " + p.getName());
            return;
        }

        for (int i = index; i < playerSize - 1; i++) {
            players[i] = players[i + 1];
        }
        players[playerSize--] = null;
    }

    private int findPLayer(Player p) {
        for (int i = 0; i < playerSize; i++) {
            if (players[i].getName().equals(p.getName())) {
                return i;
            }
        }
        return -1;
    }
}
