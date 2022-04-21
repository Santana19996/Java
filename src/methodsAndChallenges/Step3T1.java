package methodsAndChallenges;

import java.util.Arrays;

public class Step3T1 {

    public static String[] getLogicalOperators(String queryString) {

        queryString = queryString.toLowerCase();
        String[] query = queryString.split(" ");
        String getLogicalOperator = "";
        if (queryString.contains("where ")) {
            for (int i = 0; i < query.length; i++) {
                if (query[i].matches("and|or|not")) {
                    getLogicalOperator += query[i] + " ";
                }
            }
             return getLogicalOperator.toString().split(" ");
        }
        return null;

    }




    public static void main(String[] args) {
        String test = "select season,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or date > '31-12-2014'";

        System.out.println(Arrays.toString(getLogicalOperators(test)));


    }
}
