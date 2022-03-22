package methodsAndChallenges;

import java.util.Arrays;

public class CapitalizeFirstLetterStringArray {

    public static String[] capFirstName(String[] array) {
      for (int i = 0; i < array.length; i++) {
          array[i]=array[i].toLowerCase();
          array[i]=array[i].substring(0,1).toUpperCase()+array[i].substring(1);
      }
      return array;
    }

    public static String[] capMe(String[] s) {


        String[] caps = new String[s.length];
        for(int i = 0; i < s.length; i++){
            caps[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase();
        }
        return caps;
    }

    public static void main(String[] args) {
    String[] array = {"mavis", "senaida", "letty"};
        String[] array2={"Slyvia", "Kristal", "Sharilyn", "Calista"};
        String[] array3={"samuel", "MABELLE", "letitia", "meridith"};


        System.out.println(Arrays.toString(capFirstName(array)));
//        System.out.println(Arrays.toString(capFirstName(array2)));
        System.out.println(Arrays.toString(capFirstName(array3)));
    }
}

