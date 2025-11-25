public class charAt {
    public static void main(String[] args) {
        String firstName = "Jane";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        // System.out.println("Full Name: " + fullName);
        //jane doe - 8 characters
        // System.out.println("Length of full name: " + fullName.length());

        //charAt method
        for (int i=0; i<fullName.length(); i++) {
            System.out.println("Character at index " + i + ": " + fullName.charAt(i));
        }
       }
    
}
