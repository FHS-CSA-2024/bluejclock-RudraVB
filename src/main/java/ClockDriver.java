package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String testOutput = test1.getTime();
        System.out.println("Empty constructor Test - " + testOutput);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("Tick Test 1 PreTick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Test Test 1 PostTick - " + tickTest1.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest2 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick Test 2 PreTick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick Test 2 PostTick - " + tickTest2.getTime());
        
        ClockDisplaySeconds tickTest3 = new ClockDisplaySeconds(1, 00, 59);
        System.out.println("Tick Test 3 PreTick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick Test 3 PostTick - " + tickTest3.getTime());
        
        ClockDisplaySeconds tickTest4 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick Test 4 PreTick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick Test 4 PostTick - " + tickTest4.getTime());
        
        ClockDisplaySeconds tickTest5 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick Test 5 PreTick - " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("Tick Test 5 PostTick - " + tickTest5.getTime());
        
        
        
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}


/* Terminal Window Output
Empty constructor Test - 00:0
2 Arg. Con. test - 03:45
Tick Test 1 PreTick - 03:32
Test Test 1 PostTick - 03:33
Tick Test 2 PreTick - 03:32:59
Tick Test 2 PostTick - 03:33:00
Tick Test 3 PreTick - 01:00:59
Tick Test 3 PostTick - 01:01:00
Tick Test 4 PreTick - 01:59:59
Tick Test 4 PostTick - 02:00:00
Tick Test 5 PreTick - 23:59:59
Tick Test 5 PostTick - 00:00:00
*/
    
