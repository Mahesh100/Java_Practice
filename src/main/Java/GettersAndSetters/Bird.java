package GettersAndSetters;

public class Bird {

     Bird(){

    }

    static class Eagle extends Bird{
           public  String name;

            public Eagle(String name){
                this.name=name;
            }
    }

    public static void main(String[] args) {
        System.out.println(new Eagle("Bird Eagle").name);
    }

}
