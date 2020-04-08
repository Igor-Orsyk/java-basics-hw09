import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static String[] findCommon(String[] array1, String[] array2) {
    ArrayList<String> common = new ArrayList<>();
    String [] result;

    for(String upper_element : array1){
      for (String lower_element : array2){
        if (upper_element.equals(lower_element)){
          if(!common.contains(upper_element)){
            common.add(upper_element);}
        }
      }
    }
    return common.toArray(new String[0]);
  }
}