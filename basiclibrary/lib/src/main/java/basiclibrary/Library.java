/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;


public class Library {
    //////////lab02///////////start
    public static void roll(int n){
        int[] arr=new int [n];
        int num;
        for (int i = 0; i < arr.length; i++) {
            num=1 + (int)(Math.random() * ((6 - 1) + 1));
            arr[i]=num;
        }
        System.out.println("Array of rolls: "+Arrays.toString(arr));
    }
    public static void containsDuplicates( int[] arr){
        boolean num=false;
        if(arr.length!=0){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(i!=j){
                        if(arr[i]==arr[j]){
                            num=true;
                        }
                    }
                }
            }
            System.out.println("Array has duplicate: "+num);
        }else {
            System.out.println("please enter your array");
        }
    }
    public static float averages(int[]arr){
        float sum=0;
        float avg;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/ arr.length;
        return avg;
    }
    public static void AverageOfArrays(int[][] arr){
        Float avg;
        ArrayList<Float>avgOfArrays=new ArrayList<Float>();
        for (int i = 0; i < arr.length; i++) {
            avg=averages(arr[i]);
            avgOfArrays.add(avg);
        }
        System.out.println("minimum of average of arrays: "+Collections.min(avgOfArrays));
    }
//////////lab02///////////end

//////////lab03///////////start
    public static ArrayList<String> dataOfWeather(int[][]arr){
        int[] array;
        ArrayList<String>resultNeverSaw=new ArrayList<String>();
        HashSet<Integer>weather=new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            array=arr[i];
            for (int j = 0; j < array.length; j++) {
                weather.add(array[j]);
            }
        }
        int min=Collections.min(weather);
        int max=Collections.max(weather);
        System.out.println("High Temp: "+max);
        System.out.println("Low Temp: "+min);
        for (int i = min; i < max; i++) {
            if(!weather.contains(i)){
                resultNeverSaw.add("Never saw temperature: "+i);
                System.out.println("Never saw temperature: "+i);
            }
        }
        ArrayList<String>result=new ArrayList<String>();
        result.add("High Temp: "+max);
        result.add("Low Temp: "+min);
        result.addAll(resultNeverSaw);
        return result;

    }
    public static ArrayList<String> tally(List<String> names){
        ArrayList<String>result=new ArrayList<String>();
        HashMap<String,Integer>newNames=new HashMap<String,Integer>();
        for (int i = 0; i < names.size(); i++) {
            newNames.put(names.get(i),Collections.frequency(names,names.get(i)));
        }
        Integer maxValue=Collections.max(newNames.values());
        for(String j:newNames.keySet()){
            if(newNames.get(j)==maxValue){
                System.out.println(j+" received the most votes!, and number of votes: "+newNames.get(j)+" votes");
                result.add(j+" received the most votes!, and number of votes: "+newNames.get(j)+" votes");
            }
        }
        return result;
    }
//////////lab03///////////end
public boolean getGreeting() {
    return true;
}
    public static void main(String[] args){
        System.out.println("hello world");
        //////////lab02///////////start
        Library.roll(4);
        Library.containsDuplicates(new int[]{1, 2, 3, 4});
        Library.containsDuplicates(new int[]{1, 2, 2, 4});
        Library.containsDuplicates(new int[]{});
        System.out.println("Average of array: "+new Library().averages(new int[]{4,4,4,4}));
        Library.AverageOfArrays( new int[][] {
                  {66, 64, 58, 65, 71, 57, 60},
                  {57, 65, 65, 70, 72, 65, 51},
                  {55, 54, 60, 53, 59, 57, 61},
                  {1,1,1,1,1,1,1,1}
          });
        //////////lab02///////////end

        //////////lab03///////////start
       Library.dataOfWeather(new int[][] {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        });
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
         tally(votes);
        //////////lab03///////////end
    }



}
