package wesley.qscript;

import java.util.ArrayList;

import wesley.qscript.objects.Struct;

public class ItemChain {
	private ArrayList<Item> _items;
	public ItemChain()
	{
		_items = new ArrayList<Item>();
	}
	public int size() {
		return _items.size();
	}
	public boolean isEmpty() {
		return size() > 0;
	}
	public Item get(String name) {
		return get(new QbKey(name));
	}
	public Item get(QbKey name) {
		for (int i = 0; i < size(); i++) {
			Item ii = _items.get(i);
			if (ii.Name.equals(name))
				return ii;
		}
		return null;
	}
	public void put(Item i) {
		_items.add(i);
	}
	public Item pop(String name) {
		return pop(new QbKey(name));
	}
	public Item pop(QbKey name) {
		Item i = get(name);
		pop(i);
		return i;
	}
	public void pop(Item i) {
		if (i != null)
			_items.remove(i);
	}
	@Override
	public String toString()
	{
		return toString(0);
	}
	public String toString(int indent)
	{
		int struct_indent = indent;
		String strbuilder = "{";
		for (int i = 0; i < _items.size(); i++) {
			Item item = _items.get(i);
			String strcheck;
			strcheck = item.Type == Type.Struct ?
				((Struct)item).Items.toString(struct_indent + 1) : item.toString();
			if (item.Type == Type.CString || item.Type == Type.WString)
				strcheck = '"' + strcheck + '"';
			strbuilder += '\n'+indent(struct_indent+1)+item.Name+" = "+strcheck;
		}
		strbuilder += '\n';
		strbuilder += indent(struct_indent);
		strbuilder += '}';
		return strbuilder;
	}
	
	static String indent(int i) {
		String ind = "";
		for (int j = 0; j < i; j++)
			ind += '\t';
		return ind;
	}
}
