package HomeworkDay4Game;

public class MernisServiceAdapter implements GamerCheckService{
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {

        KPSPublicSoapProxy client = new KPSPublicSoapProxy();

        try {
            return client.TCKimlikNoDogrula(Long.parseLong(gamer.nationalityId), gamer.firstName.toUpperCase(),
                    gamer.lastName.toUpperCase(), gamer.dateOfBirth.getYear());
        } catch (RemoteException e) {

            e.printStackTrace();
        }
        return false;

    }
}
