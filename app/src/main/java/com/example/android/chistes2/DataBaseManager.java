package com.example.android.chistes2;

/**
 * Created by ANDROID on 10/09/2016.
 */
public class DataBaseManager {

    public static final String CREATE_TABLE =
            "CREATE TABLE chistes("
                    + "_id integer primary key autoincrement," // obligatorio _id
                    + "titulo text not null,"
                    + "chiste text not null);";


    public static final  String INSERT =
            "INSERT INTO chistes(titulo, chiste) VALUES"
                    + "('Interpretaciones','Un español se encuentra a un chino y dice: ¡Hola! Y el chino dice: Las 12:30'),"
                    + "('En la escuela','La maestra dice: A ver Luis, ¿cómo te imaginas la escuela ideal? ¡Cerrada, maestra!'),"
                    + "('De nombre Domingo','¡Mama! ¡Mama! en el colegio me dicen fin de semana. ¿y eso porque Domingo?');";

}
