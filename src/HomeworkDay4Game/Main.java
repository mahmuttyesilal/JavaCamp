package HomeworkDay4Game;

public class Main {
    public static void main(String[] args) {
        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.add(new Gamer(1, "Mahmut", "Yesilal", LocalDate.of(1994, 11, 21), "12322222222"));

        GameService GameService = new GameManager();
        GameService.add(new Game(1, "Pubg", 120));

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(new Campaign(1, "Weekend Offer", "The offer is valid on Saturday and Sunday.", 10 ));

        SalesService SalesService = new SalesManager();
        SalesService.sale(new Game(1, "Pubg", 32),new Gamer(1, "Mahmut", "Yesilal", LocalDate.of(1994, 11, 21), "12322222222"));
    }
}
