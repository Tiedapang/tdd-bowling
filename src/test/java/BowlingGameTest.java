import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    public void should_return_zero_when_all_zero(){
        //given
        int temp[] = new int[20];
        for(int i = 0;i<20;i++){
            temp[i] = 0;
        }
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(0,result);
    }
    @Test
    public void should_return_300_when_all_strike(){
        //given
        int temp[] = new int[12];
        for(int i = 0;i<12;i++){
            temp[i] = 10;
        }
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(300,result);
    }
    @Test
    public void should_return_the_true_number_when_all_spare(){
        //given
        int temp[] = new int[]{4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4,6,4};
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(140,result);
    }
    @Test
    public void should_return_the_true_number_when_all_first_plus_second_is_not_10(){
        //given
        int temp[] = new int[]{1,2,3,2,1,2,3,2,1,2,3,2,1,2,3,2,1,2,3,2};
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(40,result);
    }
    @Test
    public void should_return_the_true_number_when_all_10_or_first_plus_second_is_10(){
        //given
        int temp[] = new int[]{10,1,9,10,2,8,4,6,3,7,1,9,10,3,7,10,1,9};
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(178,result);
    }
    @Test
    public void should_return_the_true_number_when_contains_first_plus_second_is_10(){
        //given
        int temp[] = new int[]{10,1,3,8,2,3,4,6,3,7,1,10,10,3,6,4,3};
        //when
        int result = BowlingGameScore.calculate_Bowling_Score(temp);
        //then
        Assertions.assertEquals(113,result);
    }

}
