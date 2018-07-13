import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();

        arr.add("Andhra Pradesh");
        arr.add("Arunachal Pradesh");
        arr.add("Assam");
        arr.add("Bihar");
        arr.add("Chhattisgarh");
        arr.add("Goa");
        arr.add("Gujarat");
        arr.add("Haryana");
        arr.add("Himachal Pradesh");
        arr.add("Jammu and Kashmir");
        arr.add("Jharkhand");
        arr.add("Karnataka");
        arr.add("Kerala");
        arr.add("Madhya Pradesh");
        arr.add("Maharashtra");
        arr.add("Manipur");
        arr.add("Meghalaya");
        arr.add("Mizoram");
        arr.add("Nagaland");
        arr.add("Odisha");
        arr.add("Punjab");
        arr.add("Rajasthan");
        arr.add("Sikkim");
        arr.add("Tamil Nadu");
        arr.add("Telangana");
        arr.add("Tripura");
        arr.add("Uttar Pradesh");
        arr.add("West Bengal");

        while(!arr.isEmpty()) {
            String bigger = "";
            for(String words : arr) {
                if(words.length() > bigger.length()) {
                    bigger = words;
                }
            }
            System.out.println(bigger);
            while(arr.contains(bigger)) {
                arr.remove(bigger);
            }
        }
    }

}