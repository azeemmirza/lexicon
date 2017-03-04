package dictionary.linkedlist;

import dictionary.linkedlist.character.*;
import dictionary.linkedlist.principal.*;

public class Dictionary_LinkedList {

    //Setting up Principal Linked List
    public Dictionary_LinkedList() {

        char ch;
        String mean = "An English alphabet";
        
        PrincipalList PrincipalListInstance;
        PrincipalListInstance = PrincipalList.getPrincipal();
        

        for (ch = 'a'; ch <= 'z'; ch++) {

            // New Instance
            CharacterList CharList = new CharacterList();

            CharList.Insert(Character.toString(ch), mean);

            PrincipalListInstance.Insert(ch, CharList);

        }


    }

    public void Print() {
        PrincipalList PrincList = PrincipalList.getPrincipal();
        PrincipalNode temp = PrincList.start;
        CharacterNode temp2;

        while (temp != null) {

            System.out.println("Character: " + temp.Character);
            temp2 = temp.CharListPoint.start;

            while (temp2 != null) {

                System.out.println("\t\t Word: " + temp2.Word);
                System.out.println("\t\t Meaning: " + temp2.Meaning);
                System.out.println();
                System.out.println();

                temp2 = temp2.Next;
            }
            temp = temp.Next;
        }
    }

    public boolean InsertWord(String Word, String Meaning) {

        String LCWord = Word.toLowerCase();

        

        if (WordValidation(LCWord)) {

            char Character = FirstCharacter(LCWord);
            
            PrincipalList PrincipalListInstance = PrincipalList.getPrincipal();
            PrincipalNode CharacterNode = PrincipalListInstance.Search(Character);
            CharacterNode.CharListPoint.Insert(LCWord, Meaning);
            return true;

        } else return false;
    }

    public String SearchWord(String Word){

        CharacterNode Result;

        String LCWord = Word.toLowerCase();

        boolean WordValidationResult = WordValidation(LCWord);

        if (WordValidationResult == true) {

            char Character = FirstCharacter(LCWord);

            PrincipalList PrincipalListInstance = PrincipalList.getPrincipal();
            PrincipalNode CharacterNode = PrincipalListInstance.Search(Character);

            CharacterList CharacterListLink = CharacterNode.CharListPoint;
           Result= CharacterListLink.Search(LCWord);

            if(Result != null){

                return  Result.Meaning;

            }else return null;
        } else return null;
    }
    
    public void HardCodeUpdate(){
        InsertWord("abase","cause to feel shame");
        InsertWord("aberration","a state or condition markedly different from the norm");
        InsertWord("abhor","find repugnant");
    	InsertWord("adversity","a state of misfortune or affliction");
        InsertWord("aesthetic","characterized by an appreciation of beauty or good taste");
	InsertWord("ballad","a narrative song with a recurrent refrain");
    	InsertWord("ban","prohibit especially by law or social pressure");
        InsertWord("banish","expel, as if by official decree");
	InsertWord("barrage","the heavy fire of artillery to saturate an area");
        InsertWord("bearing","characteristic way of holding one's body");
	InsertWord("cease","put an end to a state or an activity");
        InsertWord("cede","relinquish possession or control over");
    	InsertWord("charisma","personal attractiveness that enables you to influence others");
	InsertWord("cogent","powerfully persuasive");
        InsertWord("dally","waste time");
        InsertWord("dapper","marked by up-to-dateness in dress and manners");
	InsertWord("dauntless","invulnerable to fear or intimidation");
        InsertWord("debunk","expose while ridiculing");
    	InsertWord("deduce","conclude by reasoning");
        InsertWord("ebullient","joyously unrestrained");
        InsertWord("edible","suitable for use as a food");
	InsertWord("egalitarian","favoring social equality");
        InsertWord("elated","full of high-spirited delight");
        InsertWord("fabricate","put together out of artificial or natural components");
    	InsertWord("facet","a distinct feature or element in a problem");
        InsertWord("facetious","cleverly amusing in tone");
        InsertWord("facile","performing adroitly and without effor");
	InsertWord("falter","the act of pausing uncertainly");
        InsertWord("gaffe","a socially awkward or tactless act");
        InsertWord("gallant","unflinching in battle or action");
    	InsertWord("gamut","a complete extent or range");
        InsertWord("garb","provide with clothes or put clothes on");
        InsertWord("garish","tastelessly showy");
	InsertWord("habitat","the type of environment in which an organism normally lives");
        InsertWord("habitual","commonly used or practiced");
	InsertWord("habitue","a regular patron");
    	InsertWord("iconoclast","someone who attacks cherished ideas or institutions");
	InsertWord("idealistic","of high moral");
        InsertWord("ideological","concerned with");
        InsertWord("idiom","expression whose meaning cannot be inferred from its words");
	InsertWord("idle","silly");
        InsertWord("jaded","dulled by surfeit");
    	InsertWord("jest","activity characterized by good humor");
        InsertWord("knell","the sound of a bell rung slowly to announce a death");
	InsertWord("knit","make by needlework with interlacing yarn");
        InsertWord("languid","lacking spirit or liveliness");
        InsertWord("legacy","a gift of personal property by will");
        InsertWord("maelstrom","a powerful circular current of water");
        InsertWord("magnanimous","noble and generous in spirit");
        
    }
     
    
    private boolean WordValidation(String Word) {

        if (isAlpha(Word)==true) {
            if (HaveOneWord(Word)) {
                return true;
            } else return false;

        } else return false;
    }

    private boolean isAlpha(String Word) {
        char[] chars = Word.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

     private boolean HaveOneWord(String Word) {

        String[] WordTrim = Word.trim().split(" ");
        
        if(WordTrim.length == 1) {
            return true;
        } else return false;

    }
     
    private char FirstCharacter(String Word) {

        String Input = Word;
        String FirstCharacterParser;
        char FirstChar;
        
        FirstCharacterParser = String.valueOf(Input.charAt(0));
        FirstChar = FirstCharacterParser.charAt(0);

        return FirstChar;
    }

   

   


}

