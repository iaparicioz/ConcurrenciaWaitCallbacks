public class ClasePrincipal {

    public ClasePrincipal() throws InterruptedException {
        Cliente cliente= new Cliente(this);
        Camarero camarero=new Camarero(this);
        cliente.start();
        camarero.start();
    }
    public void prepararComanda() throws InterruptedException {
        System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
        Main.list.add("Zumo");
        Main.list.add("Tostada");
        Main.list.add("Mermelada");
        System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
    }
}
