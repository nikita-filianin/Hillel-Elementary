public class InitializationData {

    String nicknameString = "user";
    String mailString = "mail";
    String email = "@mail.ua";

    public Information initializer(Information information) {
        for (int i = 0; i < 30; i++) {
            information.getNickname().add(i, nicknameString + i);
            information.getMail().add(mailString + i + email);
            information.getNamedMail().put(mailString + i + email, nicknameString + i);
        }
        return information;
    }

    public Information addTenValues(Information information) {
        for (int i = 0; i < 10; i++) {
            if (checkEqualsValue(information)) {
                information.getNickname().add(nicknameString);
            }
            information.getMail().add(mailString + email);
            information.getNamedMail().put(mailString + email, nicknameString);
        }

        System.out.println(checkSize(information));
        return information;
    }

    private boolean checkEqualsValue(Information information) {
        for (int i = 0; i < information.getNickname().size(); i++) {
            if (information.getNickname().contains(nicknameString)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSize(Information information) {
        if (information.getNickname().size() == information.getMail().size() &&
                information.getNickname().size() == information.getNamedMail().size()) {
            return true;
        }
        return false;
    }
}
