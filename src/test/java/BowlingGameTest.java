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

}
