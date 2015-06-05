
public class Loops {

	public static void main(String[] args) {

		/*Making a loop object*/
		Loops loop = new Loops();

		/*Making an array of ages of immediate family members*/
		int [] age = {19, 20, 31, 27, 68, 51, 60, 8, 68, 2};
		/*Want to search for the highest number, which is 68*/
		int SearchForAge = 68; 
		/*calling my second method*/
		loop.search(age, SearchForAge); 
		/*Used for counter*/
		loop.searchValue(age, SearchForAge); 
	}

	/*Searching for number in element*/
	public void search(int[] elements, int searchValue) {
		/*Loop*/
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == searchValue) {
				System.out.println("Index: " + i + " contains the search value: " + searchValue);
				break;
			}
		}

	}

	/*Increases counter when found*/ 
	public void searchValue(int[] elements, int searchValue) {
		/*Times a search value occurs*/
		int numberOfOccurences = 0;

		/*Loop to look over elements*/
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == searchValue) {
				numberOfOccurences++;			
			}
		}

		/*Print out the value and the number of times it occurs*/
		System.out.println("The value: " + searchValue + " occurs " + numberOfOccurences + " times in the array.");
	}

}