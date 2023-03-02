package day34_GarbageCollection_AccessModifier;
import static day34_GarbageCollection_AccessModifier.Circle.pi;
public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);

    }

}
/*
static import vs regular import

		regular import: imports everything from the class
			import packageName.className;
			import packageName.*;


		static import:

			import static packageName.className.staticMember;  // imports one static member of a class
			import static packageName.className.*;			 // imports all static members of a class
 */