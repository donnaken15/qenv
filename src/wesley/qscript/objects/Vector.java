package wesley.qscript.objects;
import wesley.qscript.Item;
import wesley.qscript.QbKey;
public class Vector extends Item {
	public float x, y, z;
	public Vector(float x, float y, float z) {
		Type = wesley.qscript.Type.Pair;
		this.x = x;
		this.y = y;
	}
	public Vector(QbKey name, float x, float y, float z) {
		this(x, y, z);
		Name = name;
	}
	public Vector(String name, float x, float y, float z) {
		this(new QbKey(name), x, y, z);
	}
}

