package wesley.qscript.objects;
import wesley.qscript.*;
public class CString extends Item {
	public String Value;
	public CString(String value) {
		Type = wesley.qscript.Type.CString;
		Value = value;
	}
	public CString(QbKey name, String value) {
		this(value);
		Name = name;
	}
	public CString(String name, String value) {
		this(new QbKey(name), value);
	}
	// don't want to have to implement all the methods to go to Value's
	@Override
	public String toString() {
		return Value;
	}
}
