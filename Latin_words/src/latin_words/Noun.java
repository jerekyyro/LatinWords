/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latin_words;

/**
 *
 * @author Jerezzz
 */
public class Noun {
    private final String wordText;
    private String nBody; // nominative body of the noun
    private String iBody; // inflected body
    private String suffix;
    private String gender;
    private String count;
    private String declination;
    private String declension;
    

    public Noun(String givenNoun) {
        this.wordText = givenNoun;
        // Add fuctionality for checking invalid characters?
        //.. here or in the main programme via method?        
        
        // creating empty String-variables to be filled later, for avoiding errors
        this.suffix = "";
        this.declination = "";
        this.gender = "";
        this.count = ""; 
        this.declension = "";
    }
    
    public String getlast(int howmany) {
        return this.wordText.substring(this.wordText.length() - howmany);
    }
    
    public void findSuffix() {
    // also sets the declination, declension, gender and count    
    // starting from "a" as last letter
        if(this.getlast(1).equals("a")) {
                this.suffix = "a";
                this.declination = "1st";
                
                this.count = "singular";
                this.declension = "nominative";
        }
        if (this.getlast(2).equals("ia")) {
            this.suffix = "ia";
            this.declination = "3rd";
            this.gender = "neu, ?masc or ?fem";
            this.count = "plural";
            this.declension = "nominative or accusative";
        }
            // starting from "A" as last letter
        if (this.getlast(1).equals("A")) {
            this.suffix = "A";
            this.declination = "1st";

            this.count = "singular";
            this.declension = "ablative";
        }
        // starting from "e" as last letter
        if (this.getlast(1).equals("e")) {
            this.suffix = "e";
            this.declination = "2nd or 3rd";
            this.gender = "masc";
            this.count = "singular";
            this.declension = "vocative (2nd)or ablative (3rd)";
        } 
        if (this.getlast(2).equals("ae")) {
            this.suffix = "A";
            this.declination = "1st";

            this.count = "singular or plural";
            this.declension = "genitive (sing.), dative (sing.) or nominative (pl.), ";
        }
// starting from "E" as last letter
        if (this.getlast(1).equals("E")) {
            this.suffix = "E";
            this.declination = "V";
            this.gender = "fem";
            this.count = "singular";
            this.declension = "ablative";
        } 
        // starting from "I" as last letter
        if (this.getlast(1).equals("I")) {
            this.suffix = "I";
            this.declination = "2nd or 3rd";
            this.gender = "masc (2nd, 3rd), neu (2nd, 3rd) or fem (3rd)";
            this.count = "singular (3rd) or both plural and singular (2nd)";
            this.declension = "genitive (sing., 1st), dative (sing., 2nd), ablative (sing., 2nd) or nominative (plur., 2nd)";
        }
        if (this.getlast(2).equals("uI")) {
            this.suffix = "uI";
            this.declination = "4th";

            this.count = "singular";
            this.declension = "dative";
        }
        if (this.getlast(2).equals("EI")) {
            this.suffix = "EI";
            this.declination = "5th";

            this.count = "singular";
            this.declension = "genitive or dative";
        }
        if (this.getlast(2).equals("eI")) {
            this.suffix = "eI";
            this.declination = "5th";

            this.count = "singular";
            this.declension = "genitive or dative";
        }
        // starting from "o" as last letter
        if (this.getlast(1).equals("o")) {
            this.suffix = "o";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
        // starting from "O" as last letter
        if (this.getlast(1).equals("O")) {
            this.suffix = "O";
            this.declination = "2nd";

            this.count = "singular";
            this.declension = "dative or ablative";
        }
        // starting from "U" as last letter
        if (this.getlast(1).equals("U")) {
            this.suffix = "U";
            this.declination = "4th";

            this.count = "singular";
            this.declension = "nominative or accusative";
        }
            // starting from "m" as last letter
        if(this.getlast(1).equals("m")) {
            this.suffix = "m";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
        if (this.getlast(2).equals("am")) {
            this.suffix = "am";
            this.declination = "1st";

            this.count = "singular";
            this.declension = "accusative";
        }
        if (this.getlast(2).equals("em")) {
            this.suffix = "em";
            this.declination = "3rd or 5th";
            this.gender = "masc. (3rd), fem. (3rd, 5th) or neu. (3rd)";
            this.count = "singular";
            this.declension = "accusative";
        }    
        if (this.getlast(2).equals("um")) {
            this.suffix = "um";
            this.declination = "2nd or 3rd";
            this.gender = "masc., neu. or fem.";
            this.count = "singular";
            this.declension = "2nd: Singular: nominative (neu.) or accusative (neu. and masc.); 3rd: plural: genitive";
        }        
        if (this.getlast(3).equals("ium")) {
            this.suffix = "ium";
            this.declination = "3rd";

            this.count = "plural";
            this.declension = "genitive";
        }
        if (this.getlast(3).equals("uum")) {
            this.suffix = "uum";
            this.declination = "4th";

            this.count = "plural";
            this.declension = "genitive";
        }
        if (this.getlast(3).equals("rum")) {
            this.declension = "genitive";
            this.count = "plural";
        }
        if (this.wordText.length() > 3) {
            if (this.getlast(4).equals("Arum")) {
               this.suffix = "Arum";
                this.declination = "1st";
            }
            if (this.getlast(4).equals("Erum")) {
            this.suffix = "Erum";
            this.declination = "5th";
            }
            if (this.getlast(4).equals("Orum")) {
                this.suffix = "Orum";
                this.declination = "2nd";
            }
        }

        

// starting from "r" as last letter
        if (this.getlast(1).equals("r")) {
            this.suffix = this.getlast(2); // getting the whatever vowel is before the r
            this.declination = "3rd";
            this.gender = "masc., fem. or neu.";
            this.count = "singular";
            this.declension = "nominative";
        }
        if (this.getlast(2).equals("er")) {
            this.suffix = "er";
            this.declination = "2nd";
            this.gender = "masc.";
            this.count = "singular";
            this.declension = "nominative";
        }
        
        
        
// starting from "s" as last letter
// täällä 3rd konjug. -is, -bs, -rs, -ms -loppuiset, tsekkaa myös acer
        if (this.getlast(1).equals("s")) {
            this.suffix = "s";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
        if (this.getlast(2).equals("as")) {
            this.suffix = "as";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
        if (this.getlast(2).equals("es")) {
            this.suffix = "es";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
        if (this.getlast(2).equals("Es")) {
            this.suffix = "Es";
            this.declination = "5th";

            this.count = "singular of plural";
            this.declension = "sing. & pl. nominative or accusative";
        }
        if (this.getlast(2).equals("is")) {
            this.suffix = "is";
            this.declination = "3rd";

            this.count = "singular";
            this.declension = "genitive";
        }
        if (this.getlast(2).equals("Is")) {
            this.suffix = "Is";
            this.declination = "1st or 2nd";
            this.gender = "fem., masc. or neu.";
            this.count = "plural";
            this.declension = "dative or ablative";
        }
        if (this.getlast(2).equals("os")) {
            this.suffix = "os";
            this.declination = "";
            this.gender = "";
            this.count = "";
            this.declension = "";
        }
// Os // 2nd
        if (this.getlast(2).equals("us")) {
            this.suffix = "us";
            this.declination = "2nd";
            this.gender = "masc.";
            this.count = "singular";
            this.declension = "nominative";
        }
        if (this.getlast(2).equals("Us")) {
            this.suffix = "Us";
            this.declination = "4th";

            this.count = "singular";
            this.declension = "genitive";
        }
        //-bus
        if (this.wordText.length() > 3) {
            if (this.getlast(4).equals("ibus")) {
                this.suffix = "ibus";
                this.declination = "3rd or 4th";
                this.gender = "masc., neu. or fem.";
                this.count = "plural";
                this.declension = "dative or ablative";
            }
            if (this.getlast(4).equals("Ebus")) {
                this.suffix = "Ebus";
                this.declination = "5th";

                this.count = "plural";
                this.declension = "dative or ablative";
            }
        }
// starting from "x" as last letter
        if (this.getlast(1).equals("x")) {
            this.suffix = "x";
            this.declination = "3rd";

            this.count = "singular";
            this.declension = "nominative";
        }  
        // setting repeating variables to avoid redundancy
        if (this.gender.isEmpty()) {
            if (this.declination.contains("1st")) {
                this.gender = "fem or natural masc";
            }
            else if (this.declination.contains("2nd")) {
                this.gender = "masc. or neu.";
            }
            else if (this.declination.contains("3rd")) {
                this.gender = "fem., masc. or neu.";
                //something here? LA pp. 18
            }
            else if (this.declination.contains("4th")) {
                this.gender = "masc. or neu.";
            }
            else if (this.declination.contains("5th")) {
                this.gender = "fem.";
            } 
        }    
    }
    
    public String getSuffix() {
        return "-"+this.suffix;
    }
    
    public void makeBody() {
        // separating body from given text with help of suffix
        this.nBody = this.wordText.substring(0, (this.wordText.length()-this.suffix.length()));
        // use isVowel() method here!
        //conjugation III bodies
        if (this.declination.contains("2")) {
            if (this.suffix.contains("er")) {
                this.iBody = this.nBody+"r";
            }
        }
       
        if (this.declination.contains("3") && this.isCons(this.getlast(1)) && this.isCons(this.getlast(2))) {
            // enhance this: may require better definition of 3rd declination stuff above
            this.nBody = this.nBody.substring(0, this.nBody.length()-2)+"e"+this.getlast(1);
        }
        
        if (this.nBody.substring((this.nBody.length()-1)).equals("x")) {
            System.out.println("do something here");
        } 
        this.iBody = this.wordText.substring(0, (this.wordText.length()-this.suffix.length()));
    }
    
    public String getBody() {
        
            return "Nominative body: "+this.nBody+"- , genetive body: "+this.iBody+"-";
    
    }
    
    public boolean isVowel(String v) {
        String vowels = "aeiouAEIOU";
        if (vowels.contains(v)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isCons(String v) {
        String cons = "bcdfghjklmnpqrstvxzBCDFGHJKLMNPQRSTVXZ";
        if (cons.contains(v)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        if (this.suffix.equals("")) {
            return "Not a Latin word or analysis not complete.";
            // this may be replaced by checking the nullPointer Exception at the end of getsuffix?
        } else {
        return "Given word: "+this.wordText+".\n"+this.getBody()+", suffix -"+this.suffix+"."
                + "\ndeclination "+this.declination+"\n"+this.count+" "+this.declension+","+this.gender;
    
        }
    }
    
}
