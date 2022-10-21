package com.exceptionhandling;

/** Code in catch block can signal the user, write to a log, or make a change to handle the problem.
 *  We can catch any number of exceptions.
 *  We can also catch errors, although it's not typical or recommended.
 *  And it's pretty much common to have the very last catch block look for the most generic Exception
    type. This allows any unanticipated exception to get caught. */
public class CatchingExceptions {
    public static void main(String[] args) {
        try {
            String str = "A char string";
            System.out.println("Before problem");
            char ch = str.charAt(20);   // StringIndexOutOfBoundsException
            System.out.println("After problem");    // Skips this and directly jumps to catch block
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hey - your string's not that big!");
        } catch (NullPointerException e) {
            System.out.println("Oops, perhaps you tried to access a null string!");
        } catch (Exception e) {
            System.out.println("Oops, an unexpected problem occurred!");
        }

        /*
        catch (StringIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Oops, you got some problems buddy!");
        }
        */

        // catch(OutOfMemoryError) { }
    }
}