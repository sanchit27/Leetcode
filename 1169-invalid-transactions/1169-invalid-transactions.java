class Solution {
    static class Transaction{
        String name;
        int time;
        int amount;
        String city;
        public String toString()
        {
            return name+","+time+","+amount+","+city;
        }
    }
    public List<String> invalidTransactions(String[] transactions) {
      Transaction trans[]= new Transaction[transactions.length];
        for(int i=0;i<transactions.length;i++)
        {
            String[] data=transactions[i].split(",");
            trans[i]= new Transaction();
              
            trans[i].name= data[0];
            trans[i].time=Integer.parseInt( data[1]);
            trans[i].amount=Integer.parseInt(data[2]);
            trans[i].city=data[3];
        }
        
          List<String> output = new ArrayList<>();
        for(int i = 0; i < transactions.length; i++) {
            for(int j = 0; j < transactions.length; j++) {
                if(i != j) {
                if(trans[i].name.equals(trans[j].name) && 
                   Math.abs(trans[i].time-trans[j].time)<=60 && 
                   trans[i].city.equals(trans[j].city) == false) {
                    output.add(trans[i].toString());
                    break;
                } else if(trans[i].amount > 1000) {
                    output.add(trans[i].toString());
                    break;
                }
                }
            }
        }
        return output;
        
        
    }
}