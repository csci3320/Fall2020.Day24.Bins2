public class Examples {

  public static void main(String[] args) {
    new Examples();
  }

  public Examples(){
    int[] array = new int[]{1,2,3,4,5,6,7,8,9,1};

    /* Routine 1 - Constant time complexity, O(0) or O(1)*/
    System.out.println("I have an array.");

    /* Routine 2a */
    /**
     * 1 timestep for int i=0;
     * n checks against array.length
     * n increments, i++
     * n System.out.println
     * 1 + 3*n - O(n)
     */
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

    /* Routine 2b */
    /**
     * 1 timestep for int i = 0;
     * n checks against array.length
     * n increments, i++
     * n integer declarations
     * n if statements
     * n print statements
     * 1+5*n  - O(n)
     */
    for(int i = 0; i < array.length; i++){
      int integer = array[i];
      if(integer < 0)
        System.out.println("The integer is negative");
      else
        System.out.println("The integer is positive");
    }

    /* Routine 3 */
    /*
    1 initialization, i = 0;
    n checks i < array.length
    n i++
    n initialization of j = i+1

    if i is 2
    Outer loop 2 times, inner loop 1 time
    if i is 3
    
    */
    for(int i = 0; i < array.length; i++){
      for(int j = i+1; j < array.length; j++){//How many times does this get called?
        if(array[i] == array[j])
          System.out.println("Indeces " + i + " and " + j + " match.");
      }
    }

    /* Routine 4 */

    int toFind = 2;
    int index = find(toFind, array, 0, array.length-1);
    System.out.println("Found the index at " + index);
    

  }

  public int find(int toFind, int[] array, int start, int end){
    if(start == end)
      return -1;
    int middleIndex = (end-start)/2 + start;
    int middleValue = array[middleIndex];
    if(middleValue == toFind)
      return middleIndex;
    if(middleValue < toFind){
      return find(toFind, array, middleIndex, end);
    }
    return find(toFind, array, start, middleIndex);
  }

}
