package wesley.qscript;
import wesley.qscript.objects.Int;
import wesley.qscript.objects.Pair;
import wesley.qscript.objects.Vector;
public abstract class Item {
	public Type Type;
	public QbKey Name;
	public static Item NewItem(String name, Object obj)
	{
		return NewItem(new QbKey(name), obj);
	}
	public static Item NewItem(QbKey name, Object obj)
	{
		Item item = null;
		if (obj instanceof Integer)
			item = new Int((Integer)obj);
		else if (obj instanceof Float)
			item = new wesley.qscript.objects.Float((Float)obj);
		else if (obj instanceof Double)
			item = new wesley.qscript.objects.Float(new Float((Double)obj)); // wtf
		else if (obj instanceof String)
			item = new wesley.qscript.objects.CString((String)obj);
		else if (obj instanceof QbKey)
			item = new wesley.qscript.objects.Key((QbKey)obj);
		else if (obj instanceof int[] ||
				obj instanceof float[] ||
				obj instanceof String[])
			item = new wesley.qscript.objects.Array((Object[])obj);
		item.Name = name;
		return item;
	}
}
