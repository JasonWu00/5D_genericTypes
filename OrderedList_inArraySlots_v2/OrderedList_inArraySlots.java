/**
  OrderedList_inArraySlots

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */
 import java.util.ArrayList;

public class OrderedList_inArraySlots
    implements OrderedList {

    private ArrayList<Integer> example;


    public OrderedList_inArraySlots() {
        example = new ArrayList<Integer>(10);
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return example.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return example.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( int value) {
         int dest = 0;
         for( ; dest < example.size() && example.get( dest) < value
            ; dest++) ;
         System.out.println( "OL adding " + value
                           + " at index " + dest);
         example.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public int get( int index ) {
        return example.get( index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index) {
        return example.remove( index);
    }
}
