/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary.linkedlist.character;


public class CharacterList {

    public CharacterNode start;
    public CharacterNode end;

    public void Insert(String Word, String Meaning) {
        CharacterNode temp;

        if (start == null) {

            temp = new CharacterNode(Word, Meaning, null);
            start = end = temp;

        } else {
            temp = new CharacterNode(Word, Meaning, null);
            end.Next = temp;
            end = temp;
        }
    }

    public CharacterNode Search(String Word) {

        CharacterNode SearchQ;
        SearchQ = start;
        boolean SearchStatus = false;

        while (SearchQ != null) {

            if (Word.equals(SearchQ.Word)) {
                SearchStatus = true;
                break;
            } else SearchQ = SearchQ.Next;
        }
        if(SearchStatus == true){
            return SearchQ;
        }else return null;

    }
}
