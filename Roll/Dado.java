import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random r = new Random();
        int passou = 0;
            do {
                int teste = r.nextInt((600 - 580) + 1) + 580;
                if (teste == 600) {
                    passou++;
                    System.out.println(teste);
                    System.out.println("Foi necessário " + passou + " tentativa(s) para chegar ao 600");
                    break;
            }
                else {
                    System.out.println(teste);
                    passou++;
                    continue;

                }

            }while (true);
        }
    }
