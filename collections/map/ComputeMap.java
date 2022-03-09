import java.util.*;
import java.util.function.*;

class ComputeMap {

	static Integer calculateInteger(String key, Map<String, Integer> map) {
		return map.compute(key, new BiFunction<>() {
			public Integer apply(String key, Integer value) {
				return value * 10;
			}
		});
	}

	static String calculateString(Integer key, Map<Integer, String> map) {
		return map.compute(key, new BiFunction<>(){
			public String apply(Integer key, String value) {
				return value + "@zuki";
			}
		});
	}

	static Integer calculateUsingLambda(String key, Map<String, Integer> map) {
		return map.compute(key, (k, v) ->  v * 10);
	}

	static Integer calculatePresent(String key, Map<String, Integer> map) {
		return map.computeIfPresent(key, (k, v) -> v * 11);
	}

	static Integer calculateAbsent(String key, Map<String, Integer> map) {
		return map.computeIfAbsent(key, k -> Integer.parseInt(k) * 10);
	}
}