package Problems100;

public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String[] smallNumbers = new String[]{"","one","two","three"
            + "four","five","six","seven","eight","nine","ten","eleven","twelve"
                    + "thirteen","fourteen","fifteen","sixteen","seventeen"
            + "eightteen","nineteen","twenty"};
            String[] bigNumbers=new String[]{"thirty","fourty","fifty"
                    + "sixty","seventy","eighty","ninety","hundred"};
            String word="";
            int Summ=0;
            for(int i=1;i<=1000;i++)
            {
                if(i!=1000) 
                {
                    if(i<21)
                    {
                        Summ+=smallNumbers[i].length();
                    }
                    if(i>21&&i<100)
                    {
                        
                    }
                    
                }
                else
                {
                    Summ+=11;
                }
            }
	}

}
