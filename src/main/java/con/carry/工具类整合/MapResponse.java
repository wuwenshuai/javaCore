package con.carry.工具类整合;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回Map结果对象
 * @param <K>
 * @param <V>
 */
public class MapResponse<K, V> implements Serializable {

	private static final long serialVersionUID = 632015732005672534L;
    private ResponseCode code;
	private String message;
	private List<MapEntry<K, V>> list = new ArrayList<MapEntry<K, V>>();

	public static <K, V> MapResponse<K, V> newInstance() {
		return new MapResponse<K, V>();
	}

	public static <K, V> MapResponse<K, V> newInstance(ResponseCode code,
			String message, Map<K, V> result) {
		MapResponse<K, V> response = new MapResponse<K, V>();
		return response.fill(code, message, result);
	}
	
	public MapResponse<K, V> fill(ResponseCode code, String message) {
		this.code = code;
		this.message = message;
		return this;
	}

	public MapResponse<K, V> fill(ResponseCode code, String message,
			Map<K, V> result) {
		this.code = code;
		this.message = message;
		if (result != null) {
			for (Map.Entry<K, V> entry : result.entrySet()) {
				list.add(new MapEntry<K, V>(entry.getKey(), entry.getValue()));
			}
		}
		return this;
	}

	public ResponseCode getCode() {
		return code;
	}

	public void setCode(ResponseCode code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MapEntry<K, V>> getList() {
		return list;
	}

	public void setList(List<MapEntry<K, V>> list) {
		this.list = list;
	}

	public int size() {
		return this.list.size();
	}

	public Map<K, V> getResult() {
		Map<K, V> map = new HashMap<K, V>();
		for (MapEntry<K, V> entry : list) {
			map.put(entry.getK(), entry.getV());
		}
		return map;
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public void clear() {
		this.list.clear();
	}

	public void put(K k, V v) {
		this.list.add(new MapEntry<K, V>(k, v));
	}

	public static class MapEntry<K, V> implements Serializable{
		private K k;
		private V v;

		MapEntry() {

		}

		MapEntry(K k, V v) {
			this.k = k;
			this.v = v;
		}

		public K getK() {
			return k;
		}

		public void setK(K k) {
			this.k = k;
		}

		public V getV() {
			return v;
		}

		public void setV(V v) {
			this.v = v;
		}
	}

}
