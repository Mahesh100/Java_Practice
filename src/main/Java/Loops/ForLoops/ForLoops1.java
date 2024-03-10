package Loops.ForLoops;

class ForLoops1 {
    public static void main(String [] args){
        for(int i = 0; i<=2; i++){
            System.out.println("Outer loop:" +i);
            for(int j= 0; j<=2; j++){
                System.out.println("Inner loop:"+j);
            }
        }
    }
}