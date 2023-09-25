/**
 * @author Wesley Kennedy <wesley@gmx.it>
 * 
 * qenv - run q scripts - test
 */

import wesley.qscript.*;
import wesley.qscript.objects.*;

/**
 * Entry point, DUHHH!!!!
 */
public class Main {
	public static void main(java.lang.String[] args) {
		System.out.println("q scripting environment - donnaken15");
		System.out.println(new QbKey("fastgh3"));
		Struct struct = new Struct();
		struct.Items.put(Item.NewItem("test", 11));
		struct.Items.put(Item.NewItem("float", 11.4f));
		struct.Items.put(Item.NewItem("title", ("fastgh3")));
		Struct nesttest2 = new Struct();
		nesttest2.Name = new QbKey("nesttest");
		nesttest2.Items.put(Item.NewItem("test2", 1234.5678f));
		nesttest2.Items.put(new Struct());
		nesttest2.Items.put(new Struct());
		struct.Items.put(nesttest2);
		System.out.println(struct);
	}
}
