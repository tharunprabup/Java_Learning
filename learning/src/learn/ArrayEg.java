package learn;

class EMP{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	
	@Override
	public String toString() {
		return "Employee [eid=" + id + ", ename=" + name + "]";
	}

}
public class ArrayEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for(int i=0; i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		EMP e1 = new EMP();
		e1.setName("Malar");
		EMP e2 = new EMP();
		e2.setName("Bala");

		EMP[] empArr = new EMP[2];
		
		empArr[0]=e1;
		empArr[1]=e2;
		
		System.out.println(e1);

		System.out.println(empArr[1]);
		for(EMP i : empArr)
		{
			System.out.println(i);
		}
		for(int i=0; i<empArr.length ;i++)
		{
			System.out.println(empArr[i]);
		}
	}

}
