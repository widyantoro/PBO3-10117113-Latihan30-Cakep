/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan30.cakep;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program Chatboot sederhana
 */
public class PBO310117113Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println((char)27+"[01;35mKamu"+(char)27
                           + "[01;32m ngerjain sendiri"+ (char)27 +
                           "[01;33m latihan 17 sampe" + (char)27
                           + "[01;34m latihan 30 ini?");
        
        System.out.println((char)27+ "[01;34mJawab" + (char)27 +
                            "[01;35m(Yoi/Enggak) : ");
        
        String Keterangan = scanner.next();
        
        System.out.println("");
        if("Yoi".equals(Keterangan) || ("yoi".equals(Keterangan))) {
            System.out.println((char)27+"[01;31mCakep Bener, "+ (char)27
                    + "[01;35mGoodJoob : ");
        }
       
            
        
        if("Enggak".equals(Keterangan) || ("ENGGAK".equals(Keterangan))){
            System.out.println((char)27+"[01;31mTetep Cakep Sih");
            System.out.println((char)27+"[01;35mSing Penting Paham"
                    + " Konsep nya yeee,");
            System.out.println("Keep the code works duds");
        }
    }
    
}
