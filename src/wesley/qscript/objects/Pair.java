package wesley.qscript.objects;
import wesley.qscript.*;
public class Pair extends Item {
	public float x, y;
	public Pair(float x, float y) {
		Type = wesley.qscript.Type.Pair;
		this.x = x;
		this.y = y;
	}
	public Pair(QbKey name, float x, float y) {
		this(x, y);
		Name = name;
	}
	public Pair(String name, float x, float y) {
		this(new QbKey(name), x, y);
	}
}

