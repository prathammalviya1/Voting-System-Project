import java.util.*;

public class vote {
    float BJP; //Bharatiya Janata Party (BJP)
    float INC; //Indian National congress (INC)
    float AAP; // Aam aadmi party(AAP)
    float BSP; //  Bahujan Samaj Party (BSP)
    float CPI; //Communist Party of India (CPI)
    float NPP; //National People's Party (NPP)
    float Others;

    //this function calculate the result
    static void result(int TotalVoters, int[] arr ){
//object
        vote v=new vote();
        float percent=100/TotalVoters;
        v.BJP=v.INC= v.AAP= v.BSP=v.CPI= v.NPP=v.Others=0;
        for (int i=0; i<TotalVoters ; i++){
            switch(arr[i]){
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

//                    deafult:
//                    break;
            }
        }
        System.out.println("\n\n");
        System.out.println("\tResult of election\n");
        System.out.println("BJP --> "+v.BJP*percent+"%");
        System.out.println("INC --> "+v.INC*percent+"%");
        System.out.println("AAP --> "+v.AAP*percent+"%");
        System.out.println("BSP --> "+v.BSP*percent+"%");
        System.out.println("CPI --> "+v.CPI*percent+"%");
        System.out.println("NPP --> "+v.NPP*percent+"%");
        System.out.println("Others --> "+v.Others*percent+"%");
        System.out.println("\n\n");

    }


    public static void main(String args[]){
        System.out.println("Voting System Project");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter total number of voters");
        int TotalVoters=sc.nextInt();
        int arr[]=new int [TotalVoters]; //store the result of selected option by the user
        for (int i=0; i<TotalVoters; i++){
            System.out.println("\n");
            System.out.println("Select any one option");
            System.out.println("1 --> for BJP: ");
            System.out.println("2 --> for INC: ");
            System.out.println("3 --> for AAP: ");
            System.out.println("4 --> for BSP: ");
            System.out.println("5 --> for CPI: ");
            System.out.println("6 --> for NPP: ");
            System.out.println("7 --> for Others: ");
            arr[i]=sc.nextInt();


        }
//call function
        result(TotalVoters, arr);
    }
}
