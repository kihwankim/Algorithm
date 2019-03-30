import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//������� �뷮����
public class Solution {

	static Integer[] data;
	static int total_price;
	static int discount;
	
	public static void main(String[] args) throws IOException {
		// TODO �ڵ� ������ �޼ҵ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testnumber = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<testnumber; i++){
			
			total_price = 0;
			discount = 0;
			
			int count_clo = Integer.parseInt(br.readLine());	//���� ��
			
			data = new Integer[count_clo];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<count_clo; j++){
				data[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j<count_clo; j++){
				total_price = total_price+data[j];
			}
			
			solve(data);
			total_price = total_price-discount;
			
			StringBuilder s = new StringBuilder();
			s.append("#").append(i + 1).append(" ").append(total_price);
			System.out.println(s);
		}
	
	}
	
	
	static void solve(Integer data[]){
		Arrays.sort(data,Collections.reverseOrder());
		int index_count = 0;
		int group_count = 0;
		discount = 0;
		
		//���°� �ڿ��� ���� 2 3 8 8 8�̸� (2 3)(8 8 8)�� ���� 
			for(int j = 0; j<data.length; j++){
				if(index_count%3 == 0 && group_count != data.length/3){
					if(j+2 > data.length-1){
						continue;
					}else{
					discount = discount+data[j+2];
					group_count++;
					}
				}
				index_count++;
		}
		
	}

}
