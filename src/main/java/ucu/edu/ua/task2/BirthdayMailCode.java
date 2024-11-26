package ucu.edu.ua.task2;


public class BirthdayMailCode implements MailCode{

    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy %d! birthday", client.getName(), client.getAge());
    }
    
}
