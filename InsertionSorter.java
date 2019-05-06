/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
		super(usersData);
        mySort();
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
		
		int indexToInsert;
		for ( indexToInsert = 1;
				indexToInsert < elements.size();
				indexToInsert++){
			insert1(indexToInsert);
			// for debugging
			// System.out.println( "    dbg: "
			  // + "after inserting element " + indexToInsert
			  // + " elements: " + elements
			  // );
				}
				
    }
	
	private void insert1(int alreadyInserted){
		int indexToCompare;
		String insertValue = elements.get(alreadyInserted);
		for(indexToCompare = alreadyInserted - 1;
				indexToCompare >= 0 && 
					insertValue.compareTo( elements.get(indexToCompare)) < 0;
				indexToCompare-- )
			elements.set(indexToCompare + 1, elements.get(indexToCompare));
			
		elements.set(indexToCompare + 1, insertValue);
	}
}
