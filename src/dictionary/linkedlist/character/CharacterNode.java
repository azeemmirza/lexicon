/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary.linkedlist.character;


public class CharacterNode {

    public String Word;
    public String Meaning;
    public CharacterNode Next;

    protected CharacterNode(String Word, String Meaning, CharacterNode Next){
        this.Word = Word;
        this.Meaning = Meaning;
        this.Next = Next;
    }

}
