/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_modul4;

import tp_modul4.arts.Song;
import tp_modul4.jobs.Artist;

import java.text.ParseException;

/**
 *
 * @author Ajar
 */
public class TP_MODUL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        System.out.println("NAMA : Azhar Baihaqi Nugraha");
        System.out.println("NIM  : 1301194353");
        System.out.println("");

        Artist a1 = new Artist("Budi Doremi", "1984-09-19");
        Artist a2 = new Artist("Ed Sheeran", "1991-02-17");

        a1.displayInfo();
        a2.displayInfo();

        Song song1 = new Song("Melukis Senja", a1, "2020-06-29");
        Song song2 = new Song("Photograph", a2, "2015-05-10");

        song1.displayInfo();
        song2.displayInfo();
    }
    
}
