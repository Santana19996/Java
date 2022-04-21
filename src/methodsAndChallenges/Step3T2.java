package methodsAndChallenges;

public class Step3T2 {
    public static String[] getGroupByFields(String queryString) {
        String[] getGroupBy = null;
        queryString = queryString.toLowerCase();
        if (queryString.contains("group by")) {
            int groupby = queryString.indexOf("group by");
            String group = queryString.substring(groupby + 9);
            getGroupBy = group.split(" ");
        }
        return getGroupBy;
    }
    public static void main(String[] args) {
String test1 = "select * from ipl.csv where season > 2016 and city= 'Bangalore' order by win_by_runs";
        System.out.println(getGroupByFields(test1));
    }
}
