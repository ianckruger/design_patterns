/**
 * This file contains the object Word and its descriptors for the flash card object
 * @author Ian Kruger
 */
public class Word {
   private String word;
   private String type;
   private String definition;
   private String sentence;
   
   public Word(String word, String type, String definition, String sentence) {
    this.word = word;
    this.type = type;
    this.definition = definition;
    this.sentence = sentence;
   }

   /**
    * A getter for the private word name
    * @return the stored word
    */
   public String getWord() {
    return  this.word;
   }

   /**
    * Returns the description of the word, including the type, definition, and sentence.
    * @return a definition/description of the word
    */
   public String getDescription() {

    return "Part of speech: "+this.type+"\nDefinition: "+this.definition+"\n"+this.sentence;
   }

}
