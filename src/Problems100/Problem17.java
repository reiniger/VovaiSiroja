package Problems100;

public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
        {
            String[] smallNumbers = new String[]{"","one","two","three",
             "four","five","six","seven","eight","nine","ten","eleven","twelve",
                    "thirteen","fourteen","fifteen","sixteen","seventeen"
            , "eighteen","nineteen"};
            String[] bigNumbers=new String[]{"hundred","","twenty","thirty",
                "forty","fifty", "sixty","seventy","eighty","ninety",};
            int Summ=11;
            int temp=0;
            for(int i=1;i<1000;i++)
            {
                if(i<20)
                {
                    Summ+=smallNumbers[i].length();
                }
                if(i>=20&&i<100)
                {
                  if(i%10!=0)
                  {
                      temp=i/10;
                      Summ+=bigNumbers[temp].length();
                      temp=i%10;
                      Summ+=smallNumbers[temp].length();
                  }
                  else
                  {
                      Summ+=bigNumbers[i/10].length();
                  }
                }
                if(i>=100)
                {
                    if(i%100==0)
                    {
                        Summ+=smallNumbers[i/100].length()+
                                bigNumbers[0].length();                   
                    }
                    else
                    {
                        Summ+=3;
                        temp=i/100;
                        Summ+=smallNumbers[temp].length()+bigNumbers[0].length();
                        temp=i%100;
                        if(temp<20)
                        {
                            Summ+=smallNumbers[temp].length();
                        }
                         if(temp>=20)
                        {
                          if(temp%10!=0)
                          {
                              
                              int temp2=temp/10;
                              Summ+=bigNumbers[temp2].length();
                              temp2=temp%10;
                              Summ+=smallNumbers[temp2].length();
                          }
                          else
                          {
                              Summ+=bigNumbers[temp/10].length();
                          }
                        }
                    }
                }               
            }
            System.out.println((Summ));
            System.out.print("");
	}

}
