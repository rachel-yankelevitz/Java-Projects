/*use String methods to determine whether a string meets the criteria necessary to be considered a strand of DNA.
*/
public class DNA {

  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
      String dna = dna3;
  // get length
    int strLength = dna.length();

    // store indexes as variables
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      String protein = dna.substring(3, stop);
      System.out.println("this is a protein " + protein);
    } else {
      System.out.println(dna + " No protein");
    }

  }