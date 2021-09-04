import java.util.ArrayList;

// Admin is a special version of user account where an admin can have a normal user features
// in addition to managerial privileges to control tournaments; therefore, tournaments are assigned to him.

public class Admin extends User{
    private ArrayList<String> tournaments;

    public void assignTournament(String tournament){
        if (!tournaments.contains(tournament))
            tournaments.add(tournament);
    }
    public ArrayList<String> getTournaments(){
        return tournaments;
    }
}
