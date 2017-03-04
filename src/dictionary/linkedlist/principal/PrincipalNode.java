/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary.linkedlist.principal;

import dictionary.linkedlist.character.*;


public class PrincipalNode {

    public char Character;
    public CharacterList CharListPoint;
    public PrincipalNode Next;

    protected PrincipalNode(char Character, CharacterList CharListPoint, PrincipalNode Next ){
        this.Character = Character;
        this.CharListPoint = CharListPoint;
        this.Next = Next;
    }
}

