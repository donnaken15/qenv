package wesley.qscript.objects;
import wesley.qscript.*;
public class Float extends Item {
	public float Value;
	public Float(float value) {
		Type = wesley.qscript.Type.Float;
		Value = value;
	}
	public Float(QbKey name, float value) {
		this(value);
		Name = name;
	}
	public Float(String name, float value) {
		this(new QbKey(name), value);
	}
	@Override
	public String toString() {
		return java.lang.Float.toString(Value);
	}
}

