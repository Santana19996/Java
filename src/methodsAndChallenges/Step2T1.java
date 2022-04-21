package methodsAndChallenges;

import java.util.Arrays;

public class Step2T1 {

    public static String[] getFields(String queryString) {
        queryString = queryString.toLowerCase();
        int IndexOfselect = queryString.indexOf("select ");
        int IndexOffrom = queryString.indexOf(" from");

        String newString = queryString.substring(IndexOfselect, IndexOffrom);
        String[] newArray = newString.split(",");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        return newArray;


    }

    public static String[] getFieldsMaster(String queryString) {
        queryString = queryString.toLowerCase();
        String file = queryString;
        int IndexOfselect = file.indexOf("select ");
        int IndexOffrom = file.indexOf(" from");

        String filename = file.substring(IndexOfselect + 7, IndexOffrom);
        // return filename;
        String[] fields = filename.split(",");

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        return fields;
    }


    public static void main(String[] args) {
        String test1 = "select city,winner,player_match from ipl.csv where season > 2014 and city = 'Bangalore'";


        getFieldsMaster(test1);
        System.out.println("---------");
        getFields(test1);


    }
}
