import java.util.Scanner;

public class BowlingGameScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[]  arr = scan.nextLine().split(",");
        int score[] = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            score[i] = Integer.parseInt(arr[i]);

        }
        int result = calculate_Bowling_Score(score);
        System.out.println(result);

    }


    public static int calculate_Bowling_Score(int[] score) {
        int total_score=0;
        int index = 0;
        for(int count_frame=0;count_frame<10;count_frame++){
            if(score[index]==10){
                total_score +=score[index]+score[index+1]+score[index+2];
                index++;
            }else if(score[index]+score[index+1]==10){
                total_score +=score[index]+score[index+1]+score[index+2];
                index+=2;
            }else{
                total_score +=score[index]+score[index+1];
                index+=2;
            }
        }
        return total_score;
    }

}
