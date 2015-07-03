import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DataKey {

	/**
	 * @param args
	 */
	private int dataNum;
	private List<Integer> list;
	private int[] price ;
	private final int Total;
	public int getDataNum() {
		return dataNum;
	}
	public void setDataNum(int dataNum) {
		this.dataNum = dataNum;
	}
	public void addBook(int price){
		this.dataNum ++;
		list.add(price);
	}
	public DataKey(int []a,int num,int Total){
		this.price = a;
		this.dataNum = num;
		this.Total = Total;
	}
	public void getTwo(){
		int []ob = new int[this.dataNum];
		for(int k=0;k<price.length;k++){
			ob[dataNum-k-1] = -price[k];
		}
		for(int k=0;k<price.length;k++){
			int l = 0;
			boolean flag = true;
			while(price[k]-ob[l]<=this.Total){
				l++;
				if(!(l<ob.length)){
					flag = false;
					break;
				}
			}
			if(price[k]<=-ob[l]){
				break;
			}
			if(flag){
				int all = price[k]-ob[l];
				System.out.println("resule:"+price[k]+"+"+-ob[l]+"="+all);
			}
			else{
				continue;
			}
		}
	}
	public void getThree(){
		int []ob = new int[this.dataNum];
		for(int k=0;k<price.length;k++){
			ob[dataNum-k-1] = price[k];
		}
		for(int i=0;i<price.length;i++){
			for(int j=i;j<price.length;j++){
				int t = j+1;
				if(!(t<price.length)){
					break;
				}
				boolean flag = true;
				if(ob[i]+ob[j]<this.Total){
					while(ob[i]+ob[j]+ob[t]<this.Total){
						t++;
						if(!(t<ob.length)){
							flag = false;
							break;
						}
					}
					if(flag){
						int an = ob[i]+ob[j]+ob[t];
						System.out.println("resule:"+ob[i]+"+"+ob[j]+"+"+ob[t]+"="+an);
					}
				}
			}
		}
	}
	public int search(int a,int p,int q){
		if(p-q==0){
			return q;
		}
		int t = p + (q-p)/2;
		if(a==price[t]){
			return t;
		}
		if(a>price[t]){
			q = t;
			if(p==q-1){
				if(a==price[q]){
					return q;
				}else{
					return p;
				}
			}
			else{
				return search(a,p,q);
			}
		}
		else{
			p = t;
			if(p==q-1){
				if(a<=price[q]){
					return q;
				}else{
					return p;
				}
			}
			else{
				return search(a,p,q);
			}
		}
	}
	public int getMax(){
		int sum = 0;
		for(int i=0;i<this.price.length;i++){
			sum = sum + price[price.length-i-1];
			if(sum>=2000){
				return price.length-i-1;
			}
		}
		return -1;
	}
	public int addPrice(List<Integer> list,int sum,int start,int end,int rest){
		int k = this.search(rest, start, end);
		list.add(k);
		return sum + price[k];
	}
	
	public void getBooks(){
		int start = 0;
		int start2 = 0;
		int end = 0;
		int sum = 0;
		int rest = 0;
		int k = 0;
		int badstart = this.getMax();
		int record = 9000;
		if(badstart==-1){
			System.out.println("别逗了，这不可能");
			return;
		}
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<=badstart;i++){
			start = i;
			start2 = price.length-1;
			end = price.length-1;
			sum = price[i];
			rest = this.Total - sum;
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			while(start2-start>0){
				int flag = this.addPrice(list, sum, start+1, end, rest);
				if(flag==2000){
					for(int a : list){
						System.out.println("--"+price[a]);
					}
					return;
				}else if(flag>this.Total){
					if(flag<record){
						record = flag;
						list1.removeAll(list1);
						for(int a:list){
							list1.add(a);
						}
					}
					start = list.get(list.size()-1);
					if(start2-start>0){
						start = start+1;
						sum = sum + price[start];
						rest = this.Total-sum;
						list.remove(list.size()-1);
						list.add(start);
					}
					else if(start2-start==0){
						sum = flag - price[list.get(list.size()-2)]-price[list.get(list.size()-1)];
						list.remove(list.size()-1);
						start = list.get(list.size()-1)+1;
						list.remove(list.size()-1);
						sum = sum + price[start];
						rest = this.Total-sum;
						list.add(start);
						start2 = price.length-1;
					}
				}else if(flag<this.Total){
					sum = flag;
					start = list.get(list.size()-1);
					rest = this.Total-sum;
				}
			}
		}
		System.out.println(record+"==");
		for(int a:list1){
			System.out.println("--"+price[a]);
		}
	}
	
	public static void main(String[] args) {
		int []a = {1410,431,338,206};
		DataKey data = new DataKey(a,a.length,1990);
		//data.getTwo();
		//data.getThree();
		//System.out.println(data.search(93, 6, a.length-1));
		data.getBooks();
	}

}
