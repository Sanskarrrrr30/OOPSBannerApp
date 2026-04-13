class OOPSBannerApp {
    public static void main(String[] args) {
        // UC1
        System.out.println("  OOPS ");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // UC2
        System.out.println(" *** " + "   *** " + "  ****** " + "  ***** ");
        System.out.println("** **" + "  ** **" + "  **   **" + "  **   **");
        System.out.println("** **" + "  ** **" + "  **   **" + "  **     ");
        System.out.println("** **" + "  ** **" + "  ******" + "   ***** ");
        System.out.println("** **" + "  ** **" + "  **" + "             **");
        System.out.println("** **" + "  ** **" + "  **" + "        **   **");
        System.out.println(" *** " + "   *** " + "  **" + "         ***** ");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // UC3
        System.out.println(String.join("  ", " *** ", "    *** ", "  ****** ", "  ***** "));
        System.out.println(String.join("  ", "** **", "   ** **", "  **   **", "  **   **"));
        System.out.println(String.join("  ", "** **", "   ** **", "  **   **", " **     "));
        System.out.println(String.join("  ", "** **", "   ** **", "  ******", "   ***** "));
        System.out.println(String.join("  ", "** **", "   ** **", "  **", "           **"));
        System.out.println(String.join("  ", "** **", "   ** **", "  **", "       **   **"));
        System.out.println(String.join("  ", " *** ", "    *** ", "  **", "        ***** "));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // UC4
        String[] lines = new String[7];

        lines[0] = String.join(" ", " *** ", " *** ", " ****** ", "  ***** ");
        lines[1] = String.join(" ", "** **", "** **", "**   **", "  **   **");
        lines[2] = String.join(" ", "** **", "** **", "**   **", " **     ");
        lines[3] = String.join(" ", "** **", "** **", "******", "  ***** ");
        lines[4] = String.join(" ", "** **", "** **", "**", "          **");
        lines[5] = String.join(" ", "** **", "** **", "**", "      **   **");
        lines[6] = String.join(" ", " *** ", " *** ", "**", "       ***** ");

        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // UC5
        String[] lines01 = {
                String.join(" ", " *** ", " *** ", " ****** ", "  ***** "),
                String.join(" ", "** **", "** **", "**   **", "  **   **"),
                String.join(" ", "** **", "** **", "**   **", " **     "),
                String.join(" ", "** **", "** **", "******", "  ***** "),
                String.join(" ", "** **", "** **", "**", "          **"),
                String.join(" ", "** **", "** **", "**", "      **   **"),
                String.join(" ", " *** ", " *** ", "**", "       ***** ")
        };

        for (String line : lines01) {
            System.out.println(line);
        }

    }
}