// �ִ񰪰� �ּڰ�

package Test06.Test0612_P;

public class Ayoung {

	 // ���ø� �̿��Ͽ� solution �޼��带 �� �����ߴ��� Ȯ���ϴ� main �޼���
    public static void main( String[] args ) {
        Ayoung ay = new Ayoung();

     // ���α׷��ӽ� �������� ������ ������
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( ay.solution( t1 ) );
        System.out.println( ay.solution( t2 ) );
        System.out.println( ay.solution( t3 ) );
    }

        public String solution(String s) {
            String [] cutter = s.split(" "); // �Է¹��� ��Ʈ���� �ڸ��� �Լ���
            
            String answer = min(cutter) + " " + max(cutter);  // �ּ�, �ִ밪 �Լ��� �亯 ���ڿ��� �����Ѵ�
            return answer;
        }
        
        public int max(String [] inputNum){ // �ִ��� ���ϴ� �Լ�
            int maxNum = Integer.parseInt(inputNum[0]); // �迭�� ù��° ���� int�� �����ؼ� ���� �� ����
            try{
                for(String a : inputNum){
                    int compareNum = Integer.parseInt(a); // ���� ���ڸ� ���ڷ� ��ȯ�� 
                    if(maxNum < compareNum){
                        maxNum = compareNum;
                    } // ���� ���Ͽ� �� ū ���� maxNum�� ����
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            return maxNum; // ���ؿ� �ִ� maxNum�� ����
        }
        
        public int min(String [] inputNum){
            int minNum = Integer.parseInt(inputNum[0]);
            try{
                for(String a : inputNum){
                    int compareNum = Integer.parseInt(a);
                    if(minNum > compareNum){
                        minNum = compareNum;
                    }
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
                
            return minNum;
        }
    
}