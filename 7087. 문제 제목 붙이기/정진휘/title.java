package al03;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class title {

	static char[] data;
	final static char start = 'A';
	static int[] al_data;


	public static void main(String[] args) throws IOException {
		java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
		int testnumber = Integer.parseInt(br.readLine());

		for (int i = 0; i < testnumber; i++) {
			int count = 0;
			// int index = 0;
			data = new char[Integer.parseInt(br.readLine())];

			// ù��° ���ڿ� �ձ��ڸ� ���ͼ� �迭�� ����
			// �ι�° �迭�� sort�˰��� ����
			// ����° sort�� �迭�� �̾������� count�� ���� Ȯ��
			for (int j = 0; j < data.length; j++) {
				char c_at = br.readLine().charAt(0);
				data[j] = c_at;
			}
			Arrays.sort(data);
			
			/*for (int j = 0; j < data.length - 1; j++) {
				if (data[j] == start) { // ���ĵ� �� j��°�� 'A'�̸�
					count = 1; // count = 1
					for (int k = j; k < data.length - 1; k++) {
						if ((data[k + 1] - data[k] == 1)) {
							count++;
						}else{
							break;
						}
					}
					// count++; //count����
				}else{
					break;
				}
			}*/
			al_data = new int[26];
			for(int j = 0; j< data.length; j++){
				al_data[data[j]-start] ++;
				
			}
			for(int j = 0; j<al_data.length; j++){
				if(al_data[j] != 0){
					count++;
				}else{
					break;
				}
			}

			StringBuilder s = new StringBuilder();
			s.append("#").append(i + 1).append(" ").append(count);
			System.out.println(s);
		}

	}
}
