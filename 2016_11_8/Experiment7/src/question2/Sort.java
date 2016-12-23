package question2;

public class Sort {
	public static void SelectSort(Sortable []a){
		for(int i=0;i<a.length;++i){
			int min=i;
			for(int j=a.length-1;j>=i;j--){
				if(a[min].Compare(a[j])>0){
					min=j;
				}
			}
			Sortable temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}
