package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        FileWriter file; 

        BufferedWriter buffer;

         try {
                file = new FileWriter(filnavn);
                buffer = new BufferedWriter(file);

                  // Writes the string to the file
                  buffer.write(samling.toString());

                  // Closes the writer
                  buffer.close();


            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return true;
    }
}