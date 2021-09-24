
public class IceIteratorDemo {
	
	public static void main(String[] args) {  
        CollectionofIceNames iceCompany = new CollectionofIceNames();  
        System.out.println("Ice factory displying their different Ice products \n");  
        for(Iterator iter = iceCompany.getIterator(); iter.hasNext();){  
            String iceName = (String)iter.next();  
            System.out.println("Ice name : " + iceName);  
         }      
  }  

}
