package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;

public class Bilde extends Tekst {

    private String url; //Bilde sin egen objektvariabel


    public Bilde(int id, String bruker, String dato, String tekst, String url) {

        super(id, bruker, dato, tekst);
        //hentes fra tekst, som igjen hentes fra innlegg

        this.url = url;
        //hentes fra Bilde sin egen objektvariabel
    }

    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {

        super(id, bruker, dato, likes, tekst);//hentes fra tekst
        this.url = url;//hentes fra Bilde sin egen objektvariabel
    }

    public String getUrl() {

        return this.url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    @Override
    public String toString() {

        return "\n" + bruker + "\n" + dato + "\n" + url;
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {

        throw new UnsupportedOperationException(TODO.method());

    }

    public static void main(String[]args) {

        Innlegg en = new Bilde(1, "Mats", "20.20022", "tekst", "url");
    }
}
