package less05;

public class Main {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="Hello";
		String s3 = new String("Hello");
		System.out.println(s1==s2); //true ��������� �� 1 ���� � ���'��
		System.out.println(s1==s3.intern()); //false ��������� �� ��� ���� � ���'��; .intern() ���� true �� ��������� ���� ���� � ���������� �� �����
		String s4=s1;
		s1+="!";
		System.out.println(s4);// ������ Hello �� �� ����� � ������� ����������� ���� ������ ���������� �� �������;
		System.out.println(s2.equals(s3));// ������� �� ��������
		System.out.println(s2.charAt(1));// ������� ���� �� ��������
		System.out.println(s2.indexOf("l")); // �������������� � ������
		System.out.println(s2.contains("lo"));// �������� �� � ���� ������ � ������
		System.out.println(s2.compareTo("Aello"));//��� ����������
		System.out.println(s2.length());
		
		
		
	}

}
