/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_modul4.jobs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ajar
 */
public class Artist {
    private String name;
    private Date birthday;
    private int age;

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

    public Artist(String name, String _birthday) throws ParseException{
        setName(name);
        setBirthday(stringToDate(_birthday, "yyyy-MM-dd"));
        Date date = new Date();
        int i = hitungAge(_birthday, date);
        setAge(i);
    }

    public int hitungAge(String x, Date date) throws ParseException {
        String strDate = dateToString(date, "MM/dd/yyyy");

        int tglSkrng, blnSkrng, thnSkrng;
        tglSkrng = Integer.parseInt(strDate.substring(3, 5));
        blnSkrng = Integer.parseInt(strDate.substring(0, 2));
        thnSkrng = Integer.parseInt(strDate.substring(6, 10));

        int tgl, bln;
        int thn;
        String temp = x.substring(0, 4);
        thn = Integer.parseInt(temp);
        temp = x.substring(5, 7);
        bln = Integer.parseInt(temp);
        temp = x.substring(8, 10);
        tgl = Integer.parseInt(temp);

        if (blnSkrng < bln) {
            return (thnSkrng - 1) - thn;
        } else if ((blnSkrng <= bln) && (tgl > tglSkrng)){
            return (thnSkrng - 1) - thn;
        } else {
            return thnSkrng-thn;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() throws ParseException{
//        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
//        String strDate = formatter.format(this.birthday);
        String strDate = dateToString(this.birthday, "dd MMMM yyyy");
        return strDate;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() throws ParseException{
        System.out.println("Artist name : "+this.name);
        System.out.println("Birthday    : "+getBirthday());
        System.out.println("Age         : "+this.age );
        System.out.println("");
    }
    
}
