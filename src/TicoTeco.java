/**
 * @author rafae
 */
public class TicoTeco {
    public static void main(String[] args) {
        TicoTeco ticoTeco = new TicoTeco();
        ticoTeco.ticoTeco2();
    }

    public void ticoTeco2() {
        int columns = 5;
        int rows = (int) Math.ceil(100.0 / columns);

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                int number = i + j * rows;
                if (number <= 100) {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.printf("%-10s", "TicoTeco");
                    } else if (number % 3 == 0) {
                        System.out.printf("%-10s", "Tico");
                    } else if (number % 5 == 0) {
                        System.out.printf("%-10s", "Teco");
                    } else {
                        System.out.printf("%-10s", number);
                    }
                }
            }
            System.out.println();
        }
    }
}