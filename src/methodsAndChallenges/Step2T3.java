package methodsAndChallenges;

public class Step2T3 {

    public static String[] getConditions(String queryString) {
        queryString = queryString.toLowerCase();
        String[] whereQuery;

        String tempString;
        String[] conditionQuery;
        String[] getCondition = null;
        if (queryString.contains("where")) {
            whereQuery = queryString.trim().split("where ");
            if (whereQuery[1].contains("group by")) {
                conditionQuery = whereQuery[1].trim().split("group by");
                tempString = conditionQuery[0];
            } else if (whereQuery[1].contains("order by")) {
                conditionQuery = whereQuery[1].trim().split("order by");
                tempString = conditionQuery[0];
            } else {
                tempString = whereQuery[1];
            }
            getCondition = tempString.toLowerCase().trim().split(" and | or ");
            for (String s : getCondition) {
                System.out.println(s.trim());
            }

        }
        return getCondition;
    }
    public static void main(String[] args) {
        String test1 = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";

      getConditions(test1);

    }
}
