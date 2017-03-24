/**
 * Created by user on 3/18/2017.
 */
public class exercitii1 {


    public static void main(String[] args) {

        int numar;
        numar = SkeletonJava.readIntConsole("Introduceti un numar: ");
        if (numar >= 0) {
// aici voi calcula si afisa patratul sau
            int patrat = numar*numar;
            SkeletonJava.printConsole("Aici este patratul: " +patrat);


        } else {
            //aici voi afisa numarul asa cum l-am citit
            SkeletonJava.printConsole("Aici este numarul: " +numar);

        }

    }
}
