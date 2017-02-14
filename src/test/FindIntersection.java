package test;

public class FindIntersection {

	public static void main(String[] args) {
        int[] firstArray = {3, 10, 4, 2, 8};
        int[] secondArray = {10, 4, 12, 3, 23, 1, 8};
        int[] combinedArray = new int[(int)Math.min(firstArray.length, secondArray.length)];
        int noOfIntersectionPoints=0;
        
        
         for(int f=0;f<firstArray.length;f++){
              for(int k=0;k<secondArray.length;k++){
                    if(firstArray[f]==secondArray[k]){
                    	combinedArray[noOfIntersectionPoints] = firstArray[f];
                    noOfIntersectionPoints++;
            }
          }
        }
        for (int x=0; x<noOfIntersectionPoints; x++){
           System.out.println(combinedArray[x]);
        }
        System.out.println("No of Intersection points:"+noOfIntersectionPoints);
       }
  }
