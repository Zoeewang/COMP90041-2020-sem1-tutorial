public class DayofWeekDemo {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static boolean isWeekend(DayOfWeek day) {
        return day == DayOfWeek.SATURDAY
    || day == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println(DayOfWeek.SATURDAY.compareTo(DayOfWeek.FRIDAY));

///loop
        DayOfWeek[] day = DayOfWeek.values();
        for(int i =0; i<day.length;i++){
            System.out.println(day[i]);
        }
///ordinal
        System.out.println(DayOfWeek.MONDAY.ordinal());
///return enum value
        System.out.println(DayOfWeek.valueOf("THURSDAY"));



    }
}



public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int iv;

    private DayOfWeek(int iv) {
        this.iv = iv;
    }

    public int getNumber() {
        return this.iv;
    }

    public static DayOfWeek getDay(int x) {
        DayOfWeek ret = null;
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.getNumber() == x) {
                ret = day;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(getDay(3));
    }
}



/// compareTo negative
public class demo1 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";
        System.out.println(a.compareTo(b));
    }
}


//copy constructor
   public static void main(String[] args) {
        Dog d1 = new Dog(2,"bob");
        Dog d2 = new Dog(d1);
//        System.out.println(d1);
//        System.out.println(d2);




        MissDog md = new MissDog(d1, "melbourne");
        MissDog md2 = new MissDog(md);
        d1.setName("");
        System.out.println(md.getDog());
        System.out.println(md2.getDog());
    }



public class NegativeNumberException extends Exception{

    // Must to have these two constructors
    public NegativeNumberException() {
        super("Negative Number Not Allowed!");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}



public class InputMismatchExceptionDemo {
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int firstNumber = stdin.nextInt();

            System.out.print("Enter the second integer: ");
            int secondNumber = stdin.nextInt();

            System.out.print("Your numbers are ");
            System.out.println(firstNumber + " and " + secondNumber);
        } catch(InputMismatchException e) {
            System.out.println("Please enter a positive integer.");
        }
    }
}



