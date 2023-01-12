import java.util.*;
public class Main{ 
  public static void main(String[] args){
    HashMap<String,Double> TOI=new HashMap<>();
    HashMap<String,Double> Hindu=new HashMap<>();
    HashMap<String,Double> ET=new HashMap<>();
    HashMap<String,Double> BM=new HashMap<>();
    HashMap<String,Double> HT=new HashMap<>();
    
    Scanner sc=new Scanner(System.in);

    int userInput=sc.nextInt();

    TOI.put("Monday", 3.0);
    TOI.put("Tuesday", 3.0);
    TOI.put("Wednesday", 3.0);
    TOI.put("Thursday", 3.0);
    TOI.put("Friday", 3.0);
    TOI.put("Saturday", 5.0);
    TOI.put("Sunday", 6.0);

    Hindu.put("Monday", 2.5);
    Hindu.put("Tuesday", 2.5);
    Hindu.put("Wednesday", 2.5);
    Hindu.put("Thursday", 2.5);
    Hindu.put("Friday", 2.5);
    Hindu.put("Saturday", 4.0);
    Hindu.put("Sunday", 4.0);

    ET.put("Monday", 4.0);
    ET.put("Tuesday", 4.0);
    ET.put("Wednesday", 4.0);
    ET.put("Thursday", 4.0);
    ET.put("Friday", 4.0);
    ET.put("Saturday", 4.0);
    ET.put("Sunday", 10.0);

    BM.put("Monday", 1.5);
    BM.put("Tuesday", 1.5);
    BM.put("Wednesday", 1.5);
    BM.put("Thursday", 1.5);
    BM.put("Friday", 1.5);
    BM.put("Saturday", 1.5);
    BM.put("Sunday", 1.5);

    HT.put("Monday", 2.0);
    HT.put("Tuesday", 2.0);
    HT.put("Wednesday", 2.0);
    HT.put("Thursday", 2.0);
    HT.put("Friday", 2.0);
    HT.put("Saturday", 4.0);
    HT.put("Sunday", 4.0);

    double[] sumArr=new double[5];
    int sum=0,index=0;
    for(String day:TOI.keySet()){
      sum+=TOI.get(day);
    }
    sumArr[index++]=sum;
    sum=0;

    for(String day:Hindu.keySet()){
      sum+=Hindu.get(day);
    }
    sumArr[index++]=sum;
    sum=0;

    for(String day:ET.keySet()){
      sum+=ET.get(day);
    }
    sumArr[index++]=sum;
    sum=0;

    for(String day:BM.keySet()){
      sum+=BM.get(day);
    }
    sumArr[index++]=sum;
    sum=0;

    for(String day:HT.keySet()){
      sum+=HT.get(day);
    }
    sumArr[index++]=sum;

    HashMap<String,Double> tempMap=new HashMap<>();

    ArrayList<ArrayList<String>> returnList=new ArrayList<>();


    tempMap.put("TOI", sumArr[0]);
    tempMap.put("Hindu", sumArr[1]);
    tempMap.put("ET", sumArr[2]);
    tempMap.put("BM", sumArr[3]);
    tempMap.put("HT", sumArr[4]);

    //System.out.println(tempMap);

    ArrayList<String> tempList;
    for(String c1:tempMap.keySet()){
      double sum1=0;
      tempList=new ArrayList<>();
      for(String c2:tempMap.keySet()){
        if(!c1.equals(c2)){
          sum1=tempMap.get(c1)+tempMap.get(c2);
          if(sum1<=userInput){
           tempList.add(c1);
           tempList.add(c2);
          }
        }
      }
      if(!tempList.isEmpty() && !returnList.contains(tempList)){
        returnList.add(tempList);
      }
    }

    System.out.println(returnList);
  }
}