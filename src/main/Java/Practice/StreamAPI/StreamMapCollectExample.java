package Practice.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollectExample {
    public static void main(String [] args){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ramesh","secret", "mahesh@gamil.com"));
        users.add(new User(2,"Suresh","secret", "suresh@gamil.com"));
        users.add(new User(3,"Paresh","secret", "paresh@gamil.com"));
        users.add(new User(4,"prathamesh","secret", "prathamesh@gamil.com"));

        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for(User user : users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(),user.getEmail()));
        }

        for(UserDTO dto :  usersDTO){
            System.out.println(dto);
        }

        System.out.println(usersDTO);
        System.out.println();
    }
}

class User{

    private int id;
    private String userName;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){

    }

    public User(int id, String userName, String password, String email){
        this.id =id;
        this.userName = userName;
        this.password = password;
        this.email =email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
