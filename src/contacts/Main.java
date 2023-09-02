// Contacts (Java / Java Developer) -
// Graduate Project Completed By Iván Luna, September 1, 2023. -
// For Hyperskill (Jet Brains Academy). Course: Java Developer.

package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu m;
        if (args.length == 2)
            m = new Menu(args[1]);
        else
            m = new Menu(null);
    }
}