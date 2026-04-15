// class OOPSBannerApp {
//     public static void main(String[] args) {
//         // UC1
//         System.out.println("  OOPS ");

//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         // UC2
//         System.out.println(" *** " + "   *** " + "  ****** " + "  ***** ");
//         System.out.println("** **" + "  ** **" + "  **   **" + "  **   **");
//         System.out.println("** **" + "  ** **" + "  **   **" + "  **     ");
//         System.out.println("** **" + "  ** **" + "  ******" + "   ***** ");
//         System.out.println("** **" + "  ** **" + "  **" + "             **");
//         System.out.println("** **" + "  ** **" + "  **" + "        **   **");
//         System.out.println(" *** " + "   *** " + "  **" + "         ***** ");

//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         // UC3
//         System.out.println(String.join("  ", " *** ", "    *** ", "  ****** ", "  ***** "));
//         System.out.println(String.join("  ", "** **", "   ** **", "  **   **", "  **   **"));
//         System.out.println(String.join("  ", "** **", "   ** **", "  **   **", " **     "));
//         System.out.println(String.join("  ", "** **", "   ** **", "  ******", "   ***** "));
//         System.out.println(String.join("  ", "** **", "   ** **", "  **", "           **"));
//         System.out.println(String.join("  ", "** **", "   ** **", "  **", "       **   **"));
//         System.out.println(String.join("  ", " *** ", "    *** ", "  **", "        ***** "));

//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         // UC4
//         String[] lines = new String[7];

//         lines[0] = String.join(" ", " *** ", " *** ", " ****** ", "  ***** ");
//         lines[1] = String.join(" ", "** **", "** **", "**   **", "  **   **");
//         lines[2] = String.join(" ", "** **", "** **", "**   **", " **     ");
//         lines[3] = String.join(" ", "** **", "** **", "******", "  ***** ");
//         lines[4] = String.join(" ", "** **", "** **", "**", "          **");
//         lines[5] = String.join(" ", "** **", "** **", "**", "      **   **");
//         lines[6] = String.join(" ", " *** ", " *** ", "**", "       ***** ");

//         for (String line : lines) {
//             System.out.println(line);
//         }

//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         // UC5
//         String[] lines01 = {
//                 String.join(" ", " *** ", " *** ", " ****** ", "  ***** "),
//                 String.join(" ", "** **", "** **", "**   **", "  **   **"),
//                 String.join(" ", "** **", "** **", "**   **", " **     "),
//                 String.join(" ", "** **", "** **", "******", "  ***** "),
//                 String.join(" ", "** **", "** **", "**", "          **"),
//                 String.join(" ", "** **", "** **", "**", "      **   **"),
//                 String.join(" ", " *** ", " *** ", "**", "       ***** ")
//         };

//         for (String line : lines01) {
//             System.out.println(line);
//         }

//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();
//         System.out.println();

//         // UC6
        
//     }
// }

//UC6
// public class OOPSBannerApp {

//     public static String[] getOPattern() {
//         return new String[]{
//             " *** ",
//             "** **",
//             "** **",
//             "** **",
//             "** **",
//             "** **",
//             " *** "
//         };
//     }

//     public static String[] getPPattern() {
//         return new String[]{
//             "******",
//             "**   **",
//             "**   **",
//             "******",
//             "**",
//             "**",
//             "**"
//         };
//     }

//     public static String[] getSPattern() {
//         return new String[]{
//             " ***** ",
//             "**   **",
//             "**",
//             "  ***** ",
//             "         **",
//             "     **   **",
//             "     ***** "
//         };
//     }

//     public static void main(String[] args) {

//         String[] oPattern = getOPattern();
//         String[] pPattern = getPPattern();
//         String[] sPattern = getSPattern();

//         for (int i = 0; i < oPattern.length; i++) {
//             System.out.println(
//                 oPattern[i] + "  " +
//                 oPattern[i] + "  " +
//                 pPattern[i] + "  " +
//                 sPattern[i]
//             );
//         }
//     }
// }


//UC7
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                "******",
                "**   **",
                "**   **",
                "******",
                "**",
                "**",
                "**"
            }),

            new CharacterPatternMap('S', new String[]{
                " ***** ",
                "**   **",
                "**",
                " ***** ",
                "     **",
                "**   **",
                " ***** "
            }),

            new CharacterPatternMap(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[]{"","","","","","",""};
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        printMessage("OOPS", maps);
    }
}