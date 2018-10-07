package util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class Common {
	public static Object toBean(Map<String, String[]> map, Class _class)
			throws Exception {
		Constructor constructor = _class.getConstructor();
		Object o = constructor.newInstance();
		Field[] fields = _class.getDeclaredFields();

		Set<String> key = map.keySet();
		if (fields.length == key.size()) {
			for (int i = 0; i < fields.length; i++) {
				fields[i].setAccessible(true);
				String fieldname = fields[i].getName();
				for (int j = 0; j < key.size(); j++) {
					if (fieldname == key.toArray()[j]) {
						String[] values = map.get(key.toArray()[j]);
						String value = "";
						for (int k = 0; k < values.length; k++) {
							value = value.concat(values[k] + ",");
						}
						value = value.substring(0, value.length() - 1);
						fields[i].set(o, value);
						break;
					}
				}

			}
		}
		return o;

	}
}
