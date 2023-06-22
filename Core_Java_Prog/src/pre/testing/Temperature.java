package pre.testing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Temperature {

    public static void main(String[] args) throws IOException{ 
        double[] temps = {100, 98, 80.5, 90.2, 99.4, 89.1};
        MaxMin(temps);

    }

    public static void MaxMin(double[]temps) throws IOException{
        FileWriter fwriter = new FileWriter("D:/kesava/java_file_writing.txt", true);
        PrintWriter outputfile = new PrintWriter(fwriter);
        double min= Double.MAX_VALUE;
        double max= Double.MIN_VALUE;
        double sum = 0;

        DecimalFormat formatter = new DecimalFormat("0.0");

        for(int i = 0;i<temps.length;i++){
            sum += temps[i];
            if(temps[i] > max){
                max = temps[i];
            }
            if(temps[i]< min){
                min = temps[i];
            }
        }

        double avg = sum / temps.length;
        outputfile.println("Average Temp: " + formatter.format(avg));
        outputfile.println("Maximum Temp: " + formatter.format(max));
        outputfile.println("Minimum Temp: " + formatter.format(min));
        outputfile.close();
    }
}
