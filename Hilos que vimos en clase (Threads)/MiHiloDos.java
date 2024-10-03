public class MiHiloDos extends  MiHilo implements  Runnable{

    public MiHiloDos(String nombre) {
        super(nombre);
    }

    public static void main(String[] args) {


        MiHiloDos miHiloDosPrimero = new MiHiloDos("1");
        MiHiloDos miHiloDosSegundo=new MiHiloDos("2");

        miHiloDosPrimero.start();
        miHiloDosSegundo.start();

    }

    @Override
    public void run() {
        // Implementación  método run
        for (int i = 0; i < 5; i++) {
            System.out.println("El hilo MiHiloDos " + Thread.currentThread().getName() + " está en ejecución ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
