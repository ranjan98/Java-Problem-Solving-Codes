//Code for 
import java.util.*;

public class TaskQueue{
    
     
    public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTasks){
        
        int ans[]= new int[batchSize.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = 0;
        for(int i=0;i<ans.length;i++)
        {
            
            while(numTasks.get(i)>0){
                
                int nT = numTasks.get(i);
                numTasks.set(i, nT-batchSize.get(i));
                ans[i]+=processingTime.get(i);
               
            }
        }
        int minans=ans[0];
        for(int i=0;i<ans.length;i++)
        {
            minans = Math.max(minans, ans[i]);
        }
        return minans;
    }
    public static void main(String []args){
        List<Integer> batchSize = new ArrayList<>();
        batchSize.add(3);
        batchSize.add(2);
        batchSize.add(5);
        batchSize.add(7);
        List<Integer> processingTime = new ArrayList<>();
        processingTime.add(5);
        processingTime.add(4);
        processingTime.add(10);
        processingTime.add(12);
        List<Integer> numTasks = new ArrayList<>();
        numTasks.add(10);
        numTasks.add(6);
        numTasks.add(10);
        numTasks.add(5);
        long x = minTime(batchSize, processingTime, numTasks);
        System.out.println(x);
    }
    
}


OUTPUT - 20
