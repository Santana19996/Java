//package methodsAndChallenges;
//
//public class ZipCodeAuthenticator {
//    public static boolean isValid(String zip) {
//   if(zip.length() > 5){
//       return false;
//   }
//   if(zip.contains("")){
//       return false;
//   }
//for (int i = 0; i < zip.length(); i++) {
//   if(Character.isDigit(zip.charAt(i))) {
//return true;
//}
//   }
//   return false;
//    }
//
//
//    public static void main(String[] args) {
//        String test = "test";
//        String zip = "95823";
//        String longzip = "123456";
//        String withSpace = "732 32";
////        System.out.println(isValid(test));
////        System.out.println(isValid(zip));
////        System.out.println(isValid(longzip));
//        System.out.println(isValid(withSpace));
//
//    }
//}
