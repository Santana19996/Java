package methodsAndChallenges;

public class Step2T2 {

    public static String getConditionsPartQuery(String queryString) {
       queryString = queryString.toLowerCase();
if (queryString.contains("where")){
    String[] where = queryString.split(" where");
}
return  queryString;

    }


    public static String getConditionsPartQueryMaster(String queryString) {
        String newString = "";
        queryString = queryString.toLowerCase();
        if (queryString.contains("where")) {
            String[] whereQuery = queryString.split("where ");
            if (whereQuery[1].contains("order by")) {
                int getOrderBy = whereQuery[1].indexOf("order by");
                whereQuery[1] = whereQuery[1].substring(0, getOrderBy - 1);
                newString = whereQuery[1];
            } else if (whereQuery[1].contains("group by")) {
                int getGroupBy = whereQuery[1].indexOf("group by");
                whereQuery[1] = whereQuery[1].substring(0, getGroupBy - 1);
                newString = whereQuery[1];
            } else {
                newString = whereQuery[1];
            }
        }
        return newString;

    }

    public static void main(String[] args) {
        String test1 = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";

        System.out.println(getConditionsPartQueryMaster(test1));

        System.out.println("-------------");

        System.out.println(getConditionsPartQuery(test1));


    }
}
