
This code was actual when Java9 was only available as prerelease and when the IDEs did not yet supported it.
 It still works, but its use is optimized to be imported as 'Simple Project' in Eclipse.

-------------------------------------------------------------------------------------------------

This is a approach with Java 9 modules to modularize the HOO service in the orchestration design. The modules are tightly coupled in this implementation.

Note: to compile and run the code you need a JDK 9 Early Access Release. See https://jdk9.java.net/download.


Adapt path setting in compileWithJava9.bat and execute-java9modules-tc-o.bat to point to a Java9 SDK in your local file system.


What to demonstrate?

1. Remove an arbitrary requires statement, compile and study the error message.
   Result: errors: cannot find symbol, package XY does not exist
   Reason: Necessary dependency not defined!

2. Remove an arbitrary exports statement, compile and study the error message.
   Result: errors: package XY does not exist, module not found: XY
   Reason: Defined dependency could not be resolved!

3. Call DateStringUtil from Horoscope.java or Invoice.java, compile and study the error message.
   For that purpose add call plus add import in Horoscope.java.

4. Copy DateStringUtil as TestUtil in ordertaking package, compile and study the error message.
   For that purpose, adapt package in ordertaking.TestUtils,
                     add TestUtil to complile script
                     adapt Horoscope.java to the use of TestUtil (also import statement!).

5. Add 'requires hoo.horoscope;' to module-info.java of hoo.order, compile and study the error message.
   Result: error: module not found: hoo.horoscope  requires hoo.horoscope;
   Reason: No dependency cycles possible!

6. Modify module name in a arbitrary module-info.java file, compile study the error message.
   Result: error: cannot access module-info
   Reason: module name mismatch between module-info.java and folder name in src

