package src;

import java.util.Locale;

public class CheckUsername {

    private final String username[] = {"jean", "priyal","shannon", "sofia" };
    private String givenName;

    public CheckUsername(String givenName){
        this.givenName = givenName;
    }

    public boolean checker(){
        boolean isUser = false;
        String name = givenName.toLowerCase();
        name = name.replaceAll("\\s", "");
        for (String user: username) {
            if (user.equals(name)) {
                isUser = true;
                break;
            }
        }
        return isUser;
    }
}
