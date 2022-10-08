package ua.goit.java7;

import com.google.gson.Gson;

public class App{
    public static void main( String[] args ){
//        System.out.println( "Hello World!" );
        Student usenko = new Student("Artem", "Usenko");
        System.out.println(new Gson().toJson(usenko));
    }
}
