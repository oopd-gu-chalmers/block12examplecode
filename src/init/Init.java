/* Vad printar den här koden för något?
 * Försök lista ut innan du provkör!
 */
package init;

class SuperInit {
    SuperInit() {
        hej();
    }

    public void hej() {
        System.out.print(2);
    }
}


public class Init extends SuperInit {
    int x = 1;

    Init() {}

    public void hej() {
        System.out.print(x);
    }

    public static void main(String[] args) {

        Init myInit = new Init();
    }
}