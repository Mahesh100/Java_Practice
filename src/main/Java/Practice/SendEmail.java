package Practice;

public class SendEmail {

    public void sendWelcome(User user){
        if(user != null){
            String email = user.getEmail();
            if(email !=null){
                sendEmail(email, "Welcome");
            }
        }
    }

    public void sendEmail(String email, String message){
        System.out.println("Sending email to :"+ email);
        System.out.println("Message :"+ message);
    }

    public static void main(String [] args){

        User user = new User();
        user.setName("Mahesh");
        user.setEmail("maheshkakde100@gmail.com");

        SendEmail sendEmail = new SendEmail();
        sendEmail.sendWelcome(user);

    }
}
