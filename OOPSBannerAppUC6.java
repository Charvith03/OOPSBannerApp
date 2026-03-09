public class OOPSBannerAppUC6 { 

    // Method to generate O
    public static String[] getO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method to generate P
    public static String[] getP() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Method to generate S
    public static String[] getS() {
        return new String[]{
            " *** ",
            "*   *",
            "*    ",
            " *** ",
            "    *",
            "*   *",
            " *** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Loop through rows and print OOPS
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
