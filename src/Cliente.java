public class Cliente extends Thread {

    public Cliente(ClasePrincipal clasePrincipal) {
    }



    @Override
    public void run() {
        try {
            while (true) {

                if (Main.list.isEmpty()){
                    System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                } else {
                    System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
                    Main.list.remove(0);
                    sleep(3000);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

