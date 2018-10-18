public class MainThread extends Thread {

    static String action = "c";

    @Override
    public void run() {
        System.out.println("mainTread");
        if(action.equalsIgnoreCase("c")){
            try {
                Main.create.start();
                Main.create.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(action.equalsIgnoreCase("r")){
            Main.read.start();
            try {
                Main.read.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(action.equalsIgnoreCase("u")){
            Main.update.start();
            try {
                Main.update.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(action.equalsIgnoreCase("d")){
            Main.delete.start();
            try {
                Main.delete.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("12345");


    }
}
