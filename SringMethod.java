package stringDemo;

public class SringMethod {
    public static void main(String[] args) {
        String string1="Motaleb Hossain";
        String string2="motaleb Hossain";

        System.out.println(string1);
        System.out.println("Length is: "+string2.length()); // length check


        // equal check and Case sensetive Ignore
        if(string1.equalsIgnoreCase(string2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        System.out.println();

        // String ache ki na check
        if(string1.contains(string2)){
            System.out.println("True");
        }else{
            System.out.println("Not True");
        }

        System.out.println();

        // String ache ki na check
        if(string1.contains("Motaleb")){
            System.out.println("True");
        }else{
            System.out.println("Not True");
        }

        // boolean value return..
        System.out.println();
        boolean con=string1.contains("Mota");
        System.out.print("String boolean Result: "+con);

        // boolean value return (isEmpty method)
        System.out.println();
        boolean empty=string1.isEmpty();
        System.out.print("isEmpty Method check: "+empty);

    }
}
