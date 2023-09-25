package wesley.qscript.objects;
import wesley.qscript.*;
public class Int extends Item {
	public int Value;
	public Int(int value) {
		Type = wesley.qscript.Type.Integer; // why do i need package name in front
		Value = value;
	}
	public Int(QbKey name, int value) {
		this(value);
		Name = name;
	}
	public Int(String name, int value) {
		this(new QbKey(name), value);
	}
	@Override
	public String toString() {
		return Integer.toString(Value);
	}
}
// this looks stupid to have in separate files

