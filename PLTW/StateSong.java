// StateSong.java
// This program displays the lyrics of "If You're Happy and You Know It"
// and demonstrates several String operations and concatenation features.

public class StateSong
{
    public static void main(String[] args)
    {
        String title = "If You're Happy and You Know It";
        System.out.println("Song Title: " + title);

        String loudTitle = title.toUpperCase(); 
        System.out.println("Uppercase version (immutability demo): " + loudTitle);

        String verseNumber = "Verse number: " + 1; 
        System.out.println(verseNumber);

        String line1 = "If you're happy and you know it, clap your hands";
        String line2 = " (clap clap)";
        String verse1 = line1 + line2; 
        System.out.println("\nVerse using + operator:\n" + verse1);

        String chorus = "If you're happy and you know it, ";
        chorus += "then your face will surely show it, ";
        chorus += "if you're happy and you know it, ";
        chorus += "clap your hands! (clap clap)";
        System.out.println("\nChorus using += operator:\n" + chorus);
    }
}
