package wesley.qscript.objects;
import wesley.qscript.*;
public class Key extends Item {
	public QbKey Value;
	public Key(QbKey value) {
		Type = wesley.qscript.Type.Integer; // why do i need package name in front
		Value = value;
	}
	public Key(String value) {
		this(new QbKey(value));
	}
	public Key(QbKey name, QbKey value) {
		this(value);
		Name = name;
	}
	public Key(String name, QbKey value) {
		this(new QbKey(name), value);
	}
	public Key(QbKey name, String value) {
		this(name, new QbKey(value));
	}
	public Key(String name, String value) {
		this(new QbKey(name), new QbKey(value));
	}
	@Override
	public String toString() {
		return Value.toString();
	}
}
