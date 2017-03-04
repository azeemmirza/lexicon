/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary.linkedlist.principal;

import dictionary.linkedlist.character.*;

public class PrincipalList {
    private static PrincipalList Instance = null;

    public PrincipalNode start;
    public PrincipalNode end;

    private PrincipalList(){
        start = null;
        end = null;
    }
    public static PrincipalList getPrincipal(){
        if(Instance == null){
            Instance = new PrincipalList();
        }
        return Instance;
    }



    public void Insert(char Character, CharacterList CharacterLIst){

        PrincipalNode temp;
       if (start == null){

           temp = new PrincipalNode(Character, CharacterLIst, null);
           start = end = temp;
        }else{
           temp = new PrincipalNode(Character, CharacterLIst, null);
           end.Next = temp;
           end = temp;
       }

    }

    public PrincipalNode Search(char Character){
        PrincipalNode SearchQ;
        boolean SearchStatus = false;
        SearchQ= start;

        while (SearchQ != null){
            if(Character == SearchQ.Character){
                    SearchStatus = true;
                    break;
            }
            else SearchQ = SearchQ.Next;
        }

        if(SearchStatus){
            return SearchQ;
        }else return null;
    }

    public PrincipalList getLIst(){
        return Instance;
    }
}
