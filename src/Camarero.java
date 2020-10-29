public class Camarero extends Thread {

    ClasePrincipal c;
    public Camarero(ClasePrincipal clasePrincipal) {
        c = clasePrincipal;
    }

    public Camarero() {

    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.list){
                    c.prepararComanda();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


