public class nestedfor {// public class nested for
    
    
    public static void main(String [] args) {// main method
        int month=1;// variable initialization
        int days = 30;// variable initialization

        
        for (int i = 1; i <= month; ++i) {// for statement 1
            System.out.println ("month: " + i);// output statement for loop1

            
            for (int j = 1; j <= days; ++j) {// for statement 2
                System.out.println (" Day: " + j);//output statement for loop2
            }
        }
    }

}
// displaying the 30 days of month