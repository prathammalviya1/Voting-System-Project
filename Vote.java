import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vote {
    float BJP; // Bharatiya Janata Party (BJP)
    float INC; // Indian National congress (INC)
    float AAP; // Aam aadmi party(AAP)
    float BSP; // Bahujan Samaj Party (BSP)
    float CPI; // Communist Party of India (CPI)
    float NPP; // National People's Party (NPP)
    float Others;

    static void result(int TotalVoters, int[] arr) throws IOException {
        // object
        Vote v = new Vote();
        float percent = 100 / TotalVoters;
        v.BJP = v.INC = v.AAP = v.BSP = v.CPI = v.NPP = v.Others = 0;
        for (int i = 0; i < TotalVoters; i++) {
            switch (arr[i]) {
                case 1:
                    (v.BJP)++;
                    break;
                case 2:
                    (v.INC)++;
                    break;
                case 3:
                    (v.AAP)++;
                    break;
                case 4:
                    (v.BSP)++;
                    break;
                case 5:
                    (v.CPI)++;
                    break;
                case 6:
                    (v.NPP)++;
                    break;
                case 7:
                    (v.Others)++;
                    break;
            }
        }

        FileWriter fw = new FileWriter("result.txt"); // FileWriter to write the result to a file

        fw.write("\n\n");
        fw.write("\tResult of election\n");
        fw.write("BJP --> " + v.BJP * percent + "%\n");
        fw.write("INC --> " + v.INC * percent + "%\n");
        fw.write("AAP --> " + v.AAP * percent + "%\n");
        fw.write("BSP --> " + v.BSP * percent + "%\n");
        fw.write("CPI --> " + v.CPI * percent + "%\n");
        fw.write("NPP --> " + v.NPP * percent + "%\n");
        fw.write("Others --> " + v.Others * percent + "%\n");
        fw.write("\n\n");

        fw.close(); // Close the FileWriter

        System.out.println("Result has been saved to result.txt file.");
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Voting System Project");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of voters");
        int totalVoters = sc.nextInt();
        int arr[] = new int[totalVoters]; // store the result of selected option by the user
        for (int i = 0; i < totalVoters; i++) {
            System.out.println("\n");
            System.out.println("Select any one option");
            System.out.println("1 --> for BJP: ");
            System.out.println("2 --> for INC: ");
            System.out.println("3 --> for AAP: ");
            System.out.println("4 --> for BSP: ");
            System.out.println("5 --> for CPI: ");
            System.out.println("6 --> for NPP: ");
            System.out.println("7 --> for Others: ");
            arr[i] = sc.nextInt();
        }
        result(totalVoters, arr);
    }
}
