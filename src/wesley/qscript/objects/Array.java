package wesley.qscript.objects;
import java.util.ArrayList;
import java.util.Arrays;
import wesley.qscript.Item;
import wesley.util.Util;
public class Array<T> extends Item {
	wesley.qscript.Type ArrayType;
	@SuppressWarnings("unchecked")
	public Array(Object[] obj) {
		Type = wesley.qscript.Type.Array;
		if (obj instanceof Integer[])
		{
			Items = (ArrayList<T>)Arrays.asList(Util.OATo.IntArray(obj));
			ArrayType = wesley.qscript.Type.Integer;
		}
		else if (obj instanceof java.lang.Float[])
		{
			Items = (ArrayList<T>)Arrays.asList(Util.OATo.FloatArray(obj));
			ArrayType = wesley.qscript.Type.Float;
		}
		else if (obj instanceof String[])
		{
			Items = (ArrayList<T>)Arrays.asList(Util.OATo.StringArray(obj));
			ArrayType = wesley.qscript.Type.CString;
		}
	}
	private ArrayList<T> Items;
	public Object[] toArray() {
		return Items.toArray();
	}
	public int size() {
		return Items.size();
	}
	public T set(int index, T item) {
		return Items.set(index, item);
	}
	public T get(int index) {
		return Items.get(index);
	}
	public Boolean contains(T item) {
		return Items.contains(item);
	}
	public int indexOf(T item) {
		return Items.indexOf(item);
	}
	public void add(T item) {
		Items.add(item);
	}
	public void clear() {
		Items.clear();
	}
	public T pop(int index) {
		return Items.remove(index);
	}
	public void pop(T item) {
		Items.remove(item);
	}
}
