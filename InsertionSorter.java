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
		Run insert1 for positions 1 through n–1 in the list.
	*/
    //sort the user's data, implementing insertion sort 
    public void mySort() {
		
		int indexToInsert;
		for ( indexToInsert = 1;
				indexToInsert <= elements.size()-1;
				indexToInsert++){
			insert1(indexToInsert);
			// for debugging
			// System.out.println( "    dbg: "
			  // + "after inserting element " + indexToInsert
			  // + " elements: " + elements
			  // );
				}
				
    }
	
	/**
		Given: sorted and unsorted regions

		Insert the first unsorted element in its place in the current sorted region,
		shifting all larger values, to make space,
		thereby expanding the sorted region
	*/
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
