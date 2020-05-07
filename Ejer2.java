package app;
public class Ejer2 extends Thread {

    int suma = 0;
    int[] NumArray = { 2, 7, 5, 4, 9, 3, 6, 8, 1, 10 };

    public Ejer2() {
        System.out.println(" TODAS LAS SUMAS **");
    }

    @Override
    public void run() {
        for (int i : NumArray) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            this.suma = this.suma + (int) Math.pow(i, 3);
            System.out.println("Suma de numeros al cubo " + this.suma);
        }
        System.out.println("Suma total de los numeros al cubo: " + this.suma);
    }

    public static void main(String[] args) throws Exception {
        Thread sum = new Ejer2();
        sum.start();
    }

}