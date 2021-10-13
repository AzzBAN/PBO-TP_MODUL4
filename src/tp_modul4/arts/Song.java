/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_modul4.arts;

import tp_modul4.jobs.Artist;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ajar
 */
public class Song {
    private String title;
    private Artist artist;
    private Date date;

    public Date stringToDate(String x, String pattern) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(pattern);
        Date date = formatter.parse(x);
        return date;
    }
    public String dateToString(Date x, String pattern) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String strDate = formatter.format(x);
        return strDate;
    }
    public Song(String title, Artist artist, String _release ) throws ParseException {
        setTitle(title);
        setArtist(artist);
        setDate(stringToDate(_release, "yyyy-MM-dd"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void displayInfo() throws ParseException{
        System.out.println("Title   : "+ this.title);
        System.out.println("Artist  : "+this.artist.getName());
        System.out.println("Release : "+ dateToString(this.date, "dd MMMM yyyy"));
//        String birthDate = this.artist.getBirthday();
//        DateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
//        Date date = formatter.parse(birthDate);
//        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
//        birthDate = dateFormat2.format(date);
        Date date = stringToDate(this.artist.getBirthday(), "dd MMMM yyyy");
        String birthDate = dateToString(date, "yyyy-MM-dd");

        System.out.println(this.artist.getName()+" age is "+this.artist.hitungAge(birthDate, this.date)+" when song released");
        System.out.println("");
    }
}
