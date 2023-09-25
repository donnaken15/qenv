package wesley.qscript;

import java.io.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class QbKey {
	int value;
	
	public static final QbKey NULL = new QbKey(0);
	
	public int hashCode() {
		return value;
	}
	public QbKey(int i) {
		value = i;
	}
	public QbKey(String text) {
		value = 0xFFFFFFFF;
		int len = text.length();
		for (int i = 0; i < len; i++)
		{
			char sym = text.charAt(i); // ugh
			if (sym <= 'Z' && sym >= 'A') sym += 0x20;
			// *thinking that doing less than first will be faster
			// because its checking values less than 0x80 first
			else if (sym == '/') sym = '\\';
			value = value >>> 8 & 0x00FFFFFF ^ CRCTable[(value ^ sym) & 0xFF];
		}
		DebugNames.put(value, text);
	}
	public Boolean equals(int i)
	{
		return value == i;
	}
	public Boolean equals(QbKey k)
	{
		return value == k.value;
	}
	public Boolean equals(String t)
	{
		return value == new QbKey(t).value;
	}
	@Override
	public String toString()
	{
		String d = DebugNames.get(value);
		return d != null ? d : Integer.toString(value, 16);
	}
	
	public static Dictionary<Integer, String> DebugNames;
	static int[] CRCTable;
	static {
		DebugNames = new Hashtable<Integer, String>();
	//	InitCRCTable();
	//}
	//static void InitCRCTable() {
		int table_size = 256;
		CRCTable = new int[table_size];
		int crc, poly = 0xEDB88320;
		for (int i = 0; i < table_size; i++)
		{
			crc = i;
			for (byte j = 0; j < 8; j++)
				crc = crc >>> 1 ^ (poly * (crc & 1));
			CRCTable[i] = crc;
		}
		try {
			BufferedReader f = new BufferedReader(
				new FileReader(System.getProperty("user.dir")+"\\names.txt"));
			String l;
			while ((l = f.readLine()) != null)
			{
				if (l != "")
					new QbKey(l);
			}
			f.close();
		}
		catch (IOException e) { System.err.println("names list not found"); }
	}
}
