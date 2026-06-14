public class EnumTest {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY 
    }
    
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void describeDays() {
        switch (day) {
            case MONDAY:
                System.out.println("\u0026");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.describeDays();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.describeDays();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.describeDays();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.describeDays();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.describeDays();
    }
}
