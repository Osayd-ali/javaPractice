//Demonstration for static inner class
package innerclasses;

class Outerrr{
    static int x = 20;
    int y = 40;
    static class innerr{
        public void displayy(){
            System.out.println(x + " Only static member of outer class is accessed by inner class");
        }
    }
}
public class staticinnerclass {
    public static void main(String[] args){
        Outerrr.innerr in = new Outerrr.innerr();
        in.displayy();
    }
}