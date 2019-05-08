/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
		super(usersData);
		mySort();
    }
    

    /**
		Run reigningDweeb for positions 0 through n–2 in the list.
     */
	//sort the user's data, implementing insertion sort
    public void mySort() {

        for( int next = 0
           ; next < elements.size() -1  
           ; next++) {
			   
			   elements.set( next
                        , elements.set( reiginingDweeb( next)
                                      , elements.get( next))
                        );
						
		   }
	}
	
	 
	 /** 
	 Given: sorted and unsorted regions
		Find the smallest value in the unsorted region.
		Swap it with the first value in the unsorted region, thereby expanding the sorted region
	*/
     private int reiginingDweeb( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        String dweeb = elements.get( dweebAt);
        
        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
     }
}