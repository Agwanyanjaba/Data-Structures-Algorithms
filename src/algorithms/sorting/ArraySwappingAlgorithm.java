/*Algorthm to check if two numbers are not eqaul and swap them in asceding order
    Create a method to check if first element is greater than the second
    If first element is greater than second element
        Assign second to temporary
        Assign first to second
        Assign temporary to fist
    Return array
*/

package algorithms.sorting;

/**
 *
 * @author WOCHIENG1
 */
public class ArraySwappingAlgorithm {
    private int data []= {89,33,9};
    
    //print the array
    public void printArray(){
        for(int i=0; i<data.length; i++){
            System.out.println(">>>>"+data[i]);
        }
        
    }
    
    public int [] swapArray(){
        for(int i=0; i<data.length; i++){
            if(data[i]<data[i+1]){
                int temporary = 0;
                data[temporary] = data[i];
                data[i]  = data[i+1];
                data[i+i] = data[temporary];
            }
        }
        
     return data;   
    }
    
    public static void main(String ... vargs){
        ArraySwappingAlgorithm array = new ArraySwappingAlgorithm();
        //int [] arr =
        array.printArray();
        try{
           array.swapArray();  
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.err.print(e);
        }
        
        //System.out.println(">>>>"+arr.length);
//        for(int i=0; i< arr.length; i++){
//            System.out.println(">>>>>"+arr[i]);
//        }
    }
}
