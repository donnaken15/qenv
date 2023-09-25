package wesley.util;

public class Util {
	public static class OATo {
		// STUPID!!!!
		public static int[] IntArray(Object[] a)
		{
			int l = a.length;
			int[] b = new int[l];
			for (int i = 0; i < l; i++)
				b[i] = (Integer)a[i];
			return b;
		}
		public static float[] FloatArray(Object[] a)
		{
			int l = a.length;
			float[] b = new float[l];
			for (int i = 0; i < l; i++)
				b[i] = (Float)a[i];
			return b;
		}
		public static String[] StringArray(Object[] a)
		{
			int l = a.length;
			String[] b = new String[l];
			for (int i = 0; i < l; i++)
				b[i] = (String)a[i];
			return b;
		}
	}
}
