public class Main {
    static MainThread mainThread;
    static CreateThread create;
    static ReadThread read;
    static UpdateThread update;
    static DeleteThread delete;

    public static void main(String[] args) {

        mainThread = new MainThread();
        create = new CreateThread();
        read = new ReadThread();
        update = new UpdateThread();
        delete = new DeleteThread();
        mainThread.start();

    }
}
