package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIOClass {
    private int integer;
    private double decimal;
    private char character;

    public BinaryIOClass(int integer, double decimal, char character) {
        this.integer = integer;
        this.decimal = decimal;
        this.character = character;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void saveToFile(String filename) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        dos.writeInt(integer);
        dos.writeDouble(decimal);
        dos.writeChar(character);
        dos.close();
    }

    public final static BinaryIOClass readFromFile(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        int integer = dis.readInt();
        double decimal = dis.readDouble();
        char character = dis.readChar();

        return new BinaryIOClass(integer, decimal, character);
    }
}
