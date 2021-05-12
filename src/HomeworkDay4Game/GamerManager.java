package HomeworkDay4Game;

public class GamerManager implements GamerService{

    private GamerCheckService GamerCheckService;


    public GamerManager(GamerCheckService GamerCheckService) {
        super();
        this.GamerCheckService = GamerCheckService;
    }

    @Override
    public void add(Gamer gamer) {


        if (GamerCheckService.checkIfRealPerson(gamer)) {
            System.out.println("Verified User: " + gamer.getFirstName());
        }

        else {
            System.out.println("Not a valid user");
        }

    }

    @Override
    public void delete(Gamer gamer) {

        System.out.println("User updated: " + gamer.getFirstName());

    }

    @Override
    public void update(Gamer gamer) {

        System.out.println("User deleted: " + gamer.getFirstName());

    }

}