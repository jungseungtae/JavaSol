class Tv { // Ipad�� �θ�Ŭ����
	public void on() { // �Լ�����
		System.out.println("Tv on");
		}
}	
interface Computer { // interface ����
	public void m(); // method ������ ������ ������ �ȵ�
}
class Com { // Ŭ����
	public void m() {
		System.out.println("��");
	}
}
class Ipad extends Tv implements Computer { //Tv�� ��ӹް� Com�� �����ϰڴ�.
	
	Com c = new Com(); // ��ü���� ComŬ������ public�̶� �׳� ������.
	public void m() { // �Լ�����
		c.m(); // Com�� ���� 10�� ������
	}
	public void ip() { // �Լ�����2
		m(); // �̰� COM ��?
		on(); //Tv�� ��������� ���� 2�� ������
	}
}
public class Day122_interface2{
	public static void main(String[] args) {
	
		Ipad pd = new Ipad();
		
		pd.ip();
	}
}
