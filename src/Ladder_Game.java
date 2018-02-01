import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ladder_Game {

   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub

      BufferedReader ibr = new BufferedReader(new InputStreamReader(System.in));

      int gamer = 0, high = 0;
      Random random = new Random();
      int flag, flag2 = 1; // �����Լ� ���� flag & ������� ���� flag
      int choice = 0; // ��÷����
      String ladder[][];

      System.out.println("�������� �ο� �� : ");
      gamer = Integer.parseInt(ibr.readLine());
      System.out.println("�������� ���� : ");
      high = Integer.parseInt(ibr.readLine());

      choice = random.nextInt(gamer);

      ladder = new String[high+2][(gamer)*2];
      int count = 1;
      
      for(int i = 0 ; i < (gamer)*2 ; i++) {
         if(i%2==0) { 
            ladder[0][i]=String.valueOf(count);
            if(count==choice) {
               ladder[high+1][i]="��÷";
            }else {
               ladder[high+1][i]="\t";
            }
         count++;
         }else {
            ladder[0][i]="\t";   
            ladder[high+1][i]="";
         }
      }

      for (int i = 1; i < high+1; i++) {
         for (int j = 0; j < (gamer)*2; j++) {
            if(j%2==0) {
               ladder[i][j]="|"; //������ ��� �κ�
            }else if(j==((gamer*2)-1)) {
               ladder[i][j]="";
            }else {
               flag=random.nextInt(2); 
               if(flag==1 && (flag!=flag2)) {
            	   ladder[i][j]="-------"; // ������ ��ºκ�
               }else {
                  ladder[i][j]="\t";
               }
               flag2=flag;
            }
         }
      }
      
      
      for(int i = 0; i<high+2;i++) {
         for(int j = 0; j<(gamer)*2;j++) {
            System.out.print(ladder[i][j]);
         }
         System.out.println();
      }
   }
}