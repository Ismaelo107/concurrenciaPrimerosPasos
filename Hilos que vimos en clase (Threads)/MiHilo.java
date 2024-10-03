import org.jetbrains.annotations.NotNull;

public class MiHilo extends Thread{

    public MiHilo( String nombre) {
     super(nombre);
    }

    public static void main(String[] args) {


        MiHilo hiloUno=new MiHilo("1");
        MiHilo hiloDos=new MiHilo("2");
        MiHilo hiloTres=new MiHilo("3");

        hiloUno.setPriority(2);
        hiloDos.setPriority(3);
        hiloTres.setPriority(1);
        hiloUno.start();
        hiloDos.start();
        hiloTres.start();

    }

    public void run(){
        for (int i = 0; i <11 ; i++) {
            System.out.println("El hilo "+Thread.currentThread().getName()+" este en ejecuccion ");
            if ( this.getName().equals("2") && i == 9  ) {

                throw new RuntimeException("Excepción provocada intencionalmente en el hilo " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
