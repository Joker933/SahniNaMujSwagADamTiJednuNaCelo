package cz.educanet.webik;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsersManager {
    private List<User> userlist = new ArrayList<User>();

    public boolean existujeJmeno(String jmeno) {
        for (User user : userlist) {
            if (user.dostanJmeno().equals(jmeno)) {
                return true;
            }
        }
        return false;
    }

    public void uloz(User docasnyUser) {
        userlist.add(docasnyUser);
    }

    public User ziskejJmenoHeslo(String jmeno, String heslo) {
        for (int i = 0; i < userlist.size(); i++) {
            User user = userlist.get(i);
            if (user.dostanJmeno().equals(jmeno) && user.dostanHeslo().equals(heslo)) {
                return user;
            }
        }
        return null;
    }
    public void ulozUsera(User user){
        //User.add(user);
    }


    public boolean pridejUsera(String user){
        return true;
    }
}
