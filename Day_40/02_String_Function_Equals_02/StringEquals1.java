public class StringEquals1 {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1.equals(s2)) {
            System.out.println("s1 and s2 are the same object in memory.");
        } else {
            System.out.println("s1 and s2 are different objects in memory.");
        }

        if(s1.equals(s3)) {
            System.out.println("s1 and s3 are the same object in memory.");
        } else {
            System.out.println("s1 and s3 are different objects in memory.");
        }
    }
}
