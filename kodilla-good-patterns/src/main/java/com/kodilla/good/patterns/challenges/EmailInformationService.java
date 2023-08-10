package com.kodilla.good.patterns.challenges;

class EmailInformationService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Informing user ~ " + user.getUsername() + " ~ via email");
    }
}
