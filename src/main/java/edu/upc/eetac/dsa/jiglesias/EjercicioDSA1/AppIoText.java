package edu.upc.eetac.dsa.jiglesias.EjercicioDSA1;

public class AppIoText {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Program needs the path to the file with the numbers");
            System.exit(-1);
        }

        try {
            double average = Media.average(args[0]);
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (numgrande e) {
            e.printStackTrace();
        }
    }


}
