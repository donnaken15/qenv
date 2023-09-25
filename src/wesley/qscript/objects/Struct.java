package wesley.qscript.objects;
import wesley.qscript.Item;
import wesley.qscript.ItemChain;
public class Struct extends Item {
	public ItemChain Items;
	public Struct() {
		Type = wesley.qscript.Type.Struct;
		Items = new ItemChain();
	}
	public Struct(ItemChain i) {
		Type = wesley.qscript.Type.Struct;
		Items = i;
	}
	@Override
	public String toString() {
		return Items.toString();
	}
}

