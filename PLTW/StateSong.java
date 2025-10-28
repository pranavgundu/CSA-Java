public class StateSong
{
    public static void main(String[] args)
    {
        String title = "All Hail to Massachusetts";
        System.out.println("Song Title: " + title);

        String loudTitle = title.toUpperCase(); 
        System.out.println("Uppercase version (immutability demo): " + loudTitle);

        String verseNumber = "Verse number: " + 1; 
        System.out.println(verseNumber);

        String line1 = "All hail to Massachusetts, the land of the free and the brave,";
        String line2 = " for proud are the traditions of our fathers.";
        String verse1 = line1 + line2; 
        System.out.println("\nVerse using + operator:\n" + verse1);

        String chorus = "All hail to Massachusetts, ";
        chorus += "the home of the bean and the cod, ";
        chorus += "where brave men and women have made their stand, ";
        chorus += "for liberty and God!";
        System.out.println("\nChorus using += operator:\n" + chorus);
    }
}
