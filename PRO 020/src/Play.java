public class Play {
	public static void main(String[] args) {
		StudentBody Oakton = new StudentBody();
		Oakton.init();
		Oakton.search();
		System.out.println(Oakton);	
	}
}
/*
 Student 1 Name: 
Ryan Biswas
Student 1 ID: 
1455915
Student 1 GPA: 
4.1
Student 2 Name: 
William Li
Student 2 ID: 
1325456
Student 2 GPA: 
4.2
Student 3 Name: 
Zhiguang Zheng
Student 3 ID: 
1325464
Student 3 GPA: 
4.3
Search for ID
1455915
ID- 1455915
Name- RyanBiswas
GPA- 4.1
Array Contents
|     Student 1      |
Name: RyanBiswas
ID Number: 1455915
Grade Point Average: 4.1
|     Student 2      |
Name: WilliamLi
ID Number: 1325456
Grade Point Average: 4.2
|     Student 3      |
Name: ZhiguangZheng
ID Number: 1325464
Grade Point Average: 4.3

*/