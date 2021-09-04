import java.util.ArrayList;
import java.util.UUID;


//User account class in an app where users follow results of their favourite teams.

public class User {
    private final String id;
    private String name;
    private String email;
    private String password;
    private ArrayList<String> favTeams;

    public User() {
        id = UUID.randomUUID().toString();
    }

    public User(String name, String email, String password) {
        this();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void addFavTeam(String team) {
        if (!favTeams.contains(team)) {
            favTeams.add(team);
        }else{
            System.out.println("Team already in your favourite teams!");
        }
    }
}
