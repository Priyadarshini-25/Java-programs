
/**
 * Enumeration class season - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
class demoWeek
{
    
public enum Week 
{
  MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public static void main(String[] args)
{
    for(Week s:Week.values())
    System.out.println(s);
}
}

