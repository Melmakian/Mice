public class Mice {
    public static void main(String[] args) {
        Mouse alfa = new Mouse("#1");
        Mouse mouseOne = new Mouse("#2");
        Mouse mouseTwo = new Mouse("#3");
    }
    public static class Mouse extends Thread{
        public Mouse(String name){
            super(name);
            start();
        }

        @Override
        public void run() {
            System.out.println(getName()+" start eating");
            eating();
            System.out.println(getName()+ " finished");
        }
    }
    private static void eating(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
    }
}
