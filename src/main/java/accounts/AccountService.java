package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionsToProfile;

    public AccountService() {
        loginToProfile = new HashMap<>();
        sessionsToProfile = new HashMap<>();
    }
    public void addNewUser(UserProfile userProfile){
        loginToProfile.put(userProfile.getLogin(), userProfile);
    }
    public  UserProfile getUserByLogin(String login){
        return loginToProfile.get(login);

    }
    public   UserProfile getUserBySessionId(String session){
         return sessionsToProfile.get(session);
    }

    public void addSession(String session, UserProfile user){
        sessionsToProfile.put(session, user);
    }

    public void  deleteSession(String session){
        sessionsToProfile.remove(session);
    }

}
