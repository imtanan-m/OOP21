package l9assign2_runner;

import java.util.StringTokenizer;


public class CustomStringTokenizer extends StringTokenizer {
    private String tokens;

    public CustomStringTokenizer(String tokens) 
    {
        super(tokens);
        this.tokens  = tokens;
    }
    
    @Override
    public int countTokens() 
    {
        String[] tkn = tokens.split(" "); //space will not be counted
        String[] val = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; //numeric value will not be counted
        int countTokens = 0;
        for(int i = 0; i < tkn.length ; i ++)
        {
            boolean numericValues = true;
            for(int j = 0; j < val.length; j++)
            {
                if(tkn[i].contains(val[j]))
                {
                    numericValues = false;
                }
            }
            if(numericValues)
            {
                countTokens++;
            }
        }
        
        return countTokens;
    }
}