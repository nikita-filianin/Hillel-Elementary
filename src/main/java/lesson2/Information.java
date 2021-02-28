import java.util.*;

public class Information {
    private List<String> nickname;
    private Set<String> mail;
    private Map<String, String> namedMail;

    public Information() {
        nickname = new ArrayList<>();
        mail = new HashSet<>();
        namedMail = new HashMap<>();
    }

    public List<String> getNickname() {
        return nickname;
    }

    public Set<String> getMail() {
        return mail;
    }

    public Map<String, String> getNamedMail() {
        return namedMail;
    }

    @Override
    public String toString() {
        return "Information{" +
                "nickname: " + nickname + "\n" +
                "mail: " + mail + "\n" +
                "namedMail: " + namedMail + "\n" +
                '}';
    }
}