
public class Generic2<K,V> {
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
//	Ÿ���� �� ��? Ŭ������ �� ����.
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
	
}
