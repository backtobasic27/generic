
public class Generic2<K,V> {
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
//	타입이 두 개? 클래스도 두 개다.
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
	
}
