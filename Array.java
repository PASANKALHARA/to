public class Student{
	
	public void insertStudent(int [] array,int newElement,int potion){
		for(int i = array.length;i<potion;i--){
			array[i] =array[i-1];
		}
		array[potion] =newElement;
	}
	public int findStudent(int[] array,int num){
		for(int i=0;i<array.length;i++){
			if(num == array[i]){
				return i;
			}	
		}
		return -1;
	}
	
	public void removeStudent(int []array,int num){	
		int potion = findStudent(array,num);
		for(int i =potion;i<array.length-1;i++){
			array [i]=array[i+1];
		}
		 array[array.length - 1] = 0; 	
	}
	
	public void dispaly(int []array){
		System.out.print("Studen Number :");
		for(int i =0;i< array.length;i++){
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String []args){
		int [] uniqueNumber ={103,101,74,107,84,87,109,67,111,113};
		
		Student st =new Student();
		st.dispaly(uniqueNumber);
		System.out.println("Student 84 is :"+st.findStudent(uniqueNumber,84));
		
		st.insertStudent(uniqueNumber,105,4);
		st.dispaly(uniqueNumber);
		
		st.removeStudent(uniqueNumber,109);
		st.dispaly(uniqueNumber);
		
		
		
	}
}